package ui.about

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutPortfolio() {
    Column(
        Modifier.fillMaxWidth().padding(24.dp, 96.dp, 24.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("About This Site", fontSize = 36.sp)
        Box(Modifier.weight(1f).widthIn(max = 640.dp), contentAlignment = Alignment.Center) {
            Text(
                "This site developed using Compose Multiplatform powered by Kotlin/Wasm. " +
                        "It made in 2024 as self-learning/experiment material. At the moment " +
                        "this site was in development, the tech itself was in experimental " +
                        "stage. I also wasn’t an expert of this tech. This site purely made " +
                        "with libraries that have been provided by Compose Multiplatform or " +
                        "Kotlin Multiplatform Wizard. Also, it was developed on a laptop with " +
                        "1920 * 1080 pixels screen and without responsive design in mind, so it " +
                        "should look bad on other platform. I might refactor this in the future.",
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}