package ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.local.projectsData

@Composable
fun Hero() {
    val lastUpdate = projectsData.first().date

    Box(Modifier.fillMaxWidth().fillMaxHeight().padding(24.dp, 96.dp, 24.dp, 24.dp)) {
        // top center with some margin on top
        Text(
            "Welcome to Ferosburn’s Project Archive",
            Modifier.align(Alignment.TopCenter),
            fontSize = 36.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
        // bottom left quote? it's more like author's mumbling
        Text(
            "You might say it’s a portfolio. But to be honest, I believe it more like an " +
                    "archive than a portfolio. I am bad at self-assessment. But I believe you " +
                    "can assess my skills by watching my results. If you need me, you can " +
                    "contact me.",
            Modifier.align(Alignment.BottomStart).fillMaxWidth(0.4f),
            color = MaterialTheme.colorScheme.onBackground
        )
        // bottom right site description
        Text(
            "An archive of my projects from 2021 to 2024\n" +
                    "It’s best to see in PC or landscape screen\n" +
                    "This site developed using Compose Mutliplatform, powered by Kotlin/Wasm\n" +
                    "Last update: $lastUpdate",
            Modifier.align(Alignment.BottomEnd).fillMaxWidth(0.4f),
            textAlign = TextAlign.End,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}