package ui.components

import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import utils.openLinkToNewTab

@Composable
fun ProjectsItem() {
    Card(
        Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        elevation = 5.dp
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
                    Text("Project 1", fontSize = 24.sp)
                    Column(horizontalAlignment = Alignment.End) {
                        Text("Month Year", fontSize = 12.sp)
                        Spacer(Modifier.height(4.dp))
                        Text("Platform: Web", fontSize = 12.sp)
                    }
                }
                Spacer(Modifier.height(12.dp))
                // Lower part
                Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(
                        "Project 1 is a project of something that I made for something. This project made using this language and some libraries. Made in some month and year.",
                        fontSize = 16.sp,
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("Languages:", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                        Spacer(Modifier.width(12.dp))
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            (1..3).forEach { _ ->
                                Icon(Icons.Outlined.Place, contentDescription = null)
                            }
                        }
                    }
                    Row {
                        Text(
                            "Libraries/Frameworks:",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(Modifier.width(12.dp))
                        Text("Framework 1, Library 2, Something", fontSize = 16.sp)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("Links:", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                        Spacer(Modifier.width(12.dp))
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            (1..3).forEach { _ ->
                                Icon(
                                    Icons.Outlined.Place,
                                    contentDescription = null,
                                    Modifier.clickable { openLinkToNewTab("https://github.com") })
                            }
                        }
                    }
                }
            }
        }
    }
}