package ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.model.Project
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.imageResource
import theme.color_white
import utils.openLinkToNewTab

@OptIn(ExperimentalComposeUiApi::class, ExperimentalResourceApi::class)
@Composable
fun HighlightsItem(project: Project) {
    var isHover by remember { mutableStateOf(false) }
    val zoom by animateFloatAsState(
        if (isHover) 1.6f else 1.1f,
        animationSpec = tween(durationMillis = 1000)
    )

    Card(
        modifier = Modifier
            .onPointerEvent(PointerEventType.Enter) { isHover = true }
            .onPointerEvent(PointerEventType.Exit) { isHover = false }
            .widthIn(max = 480.dp)
            .heightIn(max = 240.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Box(Modifier.fillMaxSize()) {
            Image(
                imageResource(project.images.first()),
                null,
                Modifier.fillMaxSize().alpha(0.15f).blur(5.dp)
                    .graphicsLayer(
                        scaleX = zoom,
                        scaleY = zoom
                    ),
                contentScale = ContentScale.Crop,
            )
            Column(
                Modifier.fillMaxSize().padding(16.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Bottom,
            ) {
                Text(project.projectName, fontSize = 24.sp)
                AnimatedVisibility(
                    isHover,
                    enter = fadeIn() + expandVertically(expandFrom = Alignment.Top),
                    exit = fadeOut() + shrinkVertically(shrinkTowards = Alignment.Top)
                ) {
                    Spacer(Modifier.height(8.dp))
                    Text(
                        project.description,
                        Modifier.fillMaxWidth(),
                        fontSize = 16.sp,
                        textAlign = TextAlign.End
                    )
                }
                Spacer(Modifier.height(16.dp))
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    LazyRow(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        items(project.links) { link ->
                            InfoTooltipBox(
                                "To ${link.description}",
                                Modifier.clickable { openLinkToNewTab(link.link) }
                            ) {
                                Image(
                                    imageResource(link.icon),
                                    contentDescription = link.description,
                                    Modifier.size(28.dp)
                                        .background(color_white, RoundedCornerShape(8.dp))
                                        .border(
                                            1.dp,
                                            MaterialTheme.colorScheme.outline,
                                            RoundedCornerShape(8.dp)
                                        )
                                        .padding(4.dp)
                                )
                            }
                        }
                    }
                    Text(project.date, fontSize = 12.sp)
                }
            }
        }
    }
}