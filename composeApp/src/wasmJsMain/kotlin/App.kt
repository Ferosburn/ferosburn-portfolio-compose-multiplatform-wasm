import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {
    val pageText = remember { mutableStateOf("") }
    val pagerState = rememberPagerState(pageCount = { 3 })
    val coroutineScope = rememberCoroutineScope()

    val pages = remember { setOf("Home", "Projects", "About") }

    val setPageText: (Int) -> Unit = { page ->
        pageText.value = pages.elementAt(page)
    }

    val toPage: (Int) -> Unit = { value ->
        coroutineScope.launch {
            pagerState.animateScrollToPage(value)
        }
    }

    MaterialTheme {
        Box(Modifier.fillMaxWidth()) {
            HorizontalPager(modifier = Modifier.align(Alignment.Center), state = pagerState) {_ ->
                Text(
                    text = pageText.value,
                    modifier = Modifier.fillMaxWidth().background(Color.Cyan)
                        .border(1.dp, color = Color.Blue)
                )
            }

            TopNavigationBar(Modifier.fillMaxWidth(), toPage = toPage, setPageText = setPageText)
        }
    }
}

// pages
@Composable
fun HomePage() {
}

@Composable
fun ProjectsPage() {
}

@Composable
fun AboutPage() {
}

// in home page
@Composable
fun Hero() {
}

// in projects page
@Composable
fun Highlights() {
}
@Composable
fun Projects() {
}

// in about page
@Composable
fun Profile() {
}
@Composable
fun AboutPortfolio() {
}

// in all page / component
@Composable
fun Footer() {
}

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

