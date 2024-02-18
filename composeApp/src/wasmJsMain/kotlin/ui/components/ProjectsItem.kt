package ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.model.Project
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.imageResource
import theme.color_white
import utils.openLinkToNewTab

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProjectsItem(project: Project) {
    Card(
        Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Row(Modifier.fillMaxWidth().padding(16.dp)) {
            Box(
                Modifier.size(360.dp, 240.dp).background(Color.LightGray)
            ) // TODO: replace with image/async image
            Spacer(Modifier.width(16.dp))
            // Text part
            Column(Modifier.weight(1f, fill = true)) {
                // Top part: title, date, and type of platform
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(project.projectName, fontSize = 24.sp)
                    Column(horizontalAlignment = Alignment.End) {
                        Text(project.date, fontSize = 12.sp)
                        Spacer(Modifier.height(4.dp))
                        Text(project.platform, fontSize = 12.sp)
                    }
                }
                Spacer(Modifier.height(12.dp))
                // Lower part
                Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(project.description, fontSize = 16.sp)
                    // languages
                    if (project.languages.isNotEmpty()) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("Languages:", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                            Spacer(Modifier.width(12.dp))
                            LazyRow(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                items(project.languages) { language ->
                                    InfoTooltipBox(language.name) {
                                        Image(
                                            imageResource(language.icon),
                                            contentDescription = language.name,
                                            Modifier.size(24.dp)
                                                .background(color_white, RoundedCornerShape(4.dp))
                                                .border(
                                                    1.dp,
                                                    MaterialTheme.colorScheme.outline,
                                                    RoundedCornerShape(4.dp)
                                                )
                                                .padding(2.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                    // libraries, framework, or tools
                    if (project.frameworksLibraries.isNotEmpty()) {
                        Row {
                            Text(
                                "Libraries/Frameworks:",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                            Spacer(Modifier.width(12.dp))
                            Text(project.frameworksLibraries.joinToString(", "), fontSize = 16.sp)
                        }
                    }
                    // links
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("Links:", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                        Spacer(Modifier.width(12.dp))
                        LazyRow(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            items(project.links) { link ->
                                InfoTooltipBox("To ${link.description}") {
                                    Image(
                                        imageResource(link.icon),
                                        contentDescription = link.description,
                                        Modifier.size(24.dp)
                                            .background(color_white, RoundedCornerShape(4.dp))
                                            .border(
                                                1.dp,
                                                MaterialTheme.colorScheme.outline,
                                                RoundedCornerShape(4.dp)
                                            )
                                            .padding(2.dp)
                                            .clickable { openLinkToNewTab(link.link) })
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}