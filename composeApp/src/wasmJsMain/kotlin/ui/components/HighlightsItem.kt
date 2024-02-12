package ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import utils.openLinkToNewTab

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterialApi::class)
@Composable
fun HighlightsItem() {
    var isHover by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .onPointerEvent(PointerEventType.Enter) { isHover = true }
            .onPointerEvent(PointerEventType.Exit) { isHover = false }
            .widthIn(max = 480.dp)
            .heightIn(max = 240.dp),
        onClick = { openLinkToNewTab("https://google.com") },
        shape = RoundedCornerShape(12.dp),
        elevation = 5.dp
    ) {
        Column(
            Modifier.fillMaxHeight().fillMaxWidth().padding(16.dp),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Bottom,
        ) {
            Text("Project 1", fontSize = 24.sp)
            if (isHover) {
                Spacer(Modifier.height(8.dp))
                Text(
                    "Project 1 is a project of something that I made for something. This project made using this language and some libraries. Made in some month and year.",
                    Modifier.fillMaxWidth(0.7f),
                    fontSize = 12.sp,
                    textAlign = TextAlign.End
                )
            }
            Spacer(Modifier.height(16.dp))
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row {
                    IconButton({ openLinkToNewTab("https://maps.google.com") }) {
                        Icon(Icons.Outlined.Place, "")
                    }
                    IconButton({ openLinkToNewTab("https://maps.google.com") }) {
                        Icon(Icons.Outlined.Place, "")
                    }
                    IconButton({ openLinkToNewTab("https://maps.google.com") }) {
                        Icon(Icons.Outlined.Place, "")
                    }
                }
                Text("MMMM YYYY", fontSize = 12.sp)
            }
        }
    }
}