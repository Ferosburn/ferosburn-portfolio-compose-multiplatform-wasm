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
    setPageText: (Int) -> Unit = {}
) {
    val onClick: (Int) -> Unit = { index ->
        toPage(index)
        setPageText(index)
    }
    Row(
        modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally)
    ) {
        TextButton(onClick = { onClick(0) }) {
            Text("Home")
        }
        TextButton(onClick = { onClick(1) }) {
            Text("Projects")
        }
        TextButton(onClick = { onClick(2) }) {
            Text("About")
        }
    }
}