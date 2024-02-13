import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import ui.about.AboutPortfolio
import ui.about.Profile
import ui.components.TopNavigationBar
import ui.home.Hero
import ui.projects.Highlights
import ui.projects.Projects

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
            HorizontalPager(
                modifier = Modifier.align(Alignment.Center).fillMaxHeight().border(1.dp, Color.Red),
                state = pagerState
            ) { page ->
                when (page) {
                    0 -> HomePage()
                    1 -> ProjectsPage()
                    2 -> AboutPage()
                }
            }

            TopNavigationBar(Modifier.fillMaxWidth(), toPage = toPage, setPageText = setPageText)
        }
    }
}

// pages
@Composable
fun HomePage() {
    Hero()
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProjectsPage() {
    val pagerState = rememberPagerState(pageCount = { 2 })

    VerticalPager(
        state = pagerState
    ) { page ->
        when (page) {
            0 -> Highlights()
            1 -> Projects()
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AboutPage() {
    val pagerState = rememberPagerState(pageCount = { 2 })

    VerticalPager(modifier = Modifier.fillMaxHeight(), state = pagerState) { page ->
        when (page) {
            0 -> Profile()
            1 -> AboutPortfolio()
        }
    }
}