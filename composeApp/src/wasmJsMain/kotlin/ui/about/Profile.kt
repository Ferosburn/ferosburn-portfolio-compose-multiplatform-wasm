package ui.about

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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Map
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.model.Contact
import ferosburnportofolio.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.imageResource
import theme.color_white
import ui.components.InfoTooltipBox
import utils.openLinkToNewTab

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Profile() {
    val contacts = remember {
        mutableStateListOf(
            Contact("LinkedIn", "https://www.linkedin.com/in/suudika/", Res.drawable.ic_linkedin),
            Contact("GitHub", "https://github.com/Ferosburn", Res.drawable.ic_github),
        )
    }

    Column(
        Modifier.fillMaxWidth().padding(24.dp, 96.dp, 24.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("About Developer", fontSize = 36.sp, color = MaterialTheme.colorScheme.onBackground)
        Box(Modifier.weight(1f), contentAlignment = Alignment.Center) {
            Row(
                Modifier.widthIn(max = 1024.dp).heightIn(max = 360.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    imageResource(Res.drawable.img_profile_picture),
                    null,
                    Modifier.size(360.dp, 360.dp)
                )
                Spacer(Modifier.width(36.dp))
                Column {
                    Text(
                        "Su'udi Khoirul Anam",
                        fontSize = 36.sp,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                    Spacer(Modifier.height(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Outlined.Map,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            "Yogyakarta, Indonesia",
                            fontSize = 24.sp,
                            color = MaterialTheme.colorScheme.onBackground
                        )
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
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                    LazyRow(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.End)
                    ) {
                        items(contacts) { contact ->
                            InfoTooltipBox(
                                contact.label,
                                Modifier.clickable { openLinkToNewTab(contact.link) }
                            ) {
                                Image(
                                    imageResource(contact.icon),
                                    contentDescription = contact.label,
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
                }
            }
        }
    }
}