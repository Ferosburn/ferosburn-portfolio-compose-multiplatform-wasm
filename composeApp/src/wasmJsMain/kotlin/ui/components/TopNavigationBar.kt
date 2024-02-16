package ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopNavigationBar(
    modifier: Modifier = Modifier,
    toPage: (Int) -> Unit = {},
) {
    Row(
        modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally)
    ) {
        TextButton(onClick = { toPage(0) }) { Text("Home") }
        TextButton(onClick = { toPage(1) }) { Text("Projects") }
        TextButton(onClick = { toPage(2) }) { Text("About") }
    }
}