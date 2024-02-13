package ui.about

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import utils.openLinkToNewTab

@Composable
fun Profile() {
    Column(
        Modifier.fillMaxWidth().padding(24.dp, 96.dp, 24.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("About Developer", fontSize = 36.sp)
        Box(Modifier.weight(1f), contentAlignment = Alignment.Center) {
            Row(
                Modifier.widthIn(max = 1024.dp).heightIn(max = 360.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    Modifier.size(360.dp, 360.dp).background(Color.LightGray)
                ) // TODO: replace with image/async image
                Spacer(Modifier.width(36.dp))
                Column {
                    Text("Su'udi Khoirul Anam", fontSize = 36.sp)
                    Spacer(Modifier.height(8.dp))
                    Row {
                        Icon(Icons.Outlined.Place, contentDescription = null)
                        Spacer(Modifier.width(8.dp))
                        Text("Yogyakarta, Indonesia", fontSize = 24.sp)
                    }
                    Spacer(Modifier.height(24.dp))
                    Text(
                        "I have been interested in software development since 2020. Since " +
                                "then I have been learning various software development tools, " +
                                "day-by-day, by self-taught, experiments, training, or even " +
                                "bootcamps, and still continue till now. My motto is \"Keep " +
                                "learning, because learning is a life time process\". I also " +
                                "have experience in front-end web, mobile, and a little bit " +
                                "back-end development. I have a dream of becoming a front-end " +
                                "engineer or software engineer in general.",
                        Modifier.weight(1f),
                        fontSize = 16.sp
                    )
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.End)
                    ) {
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