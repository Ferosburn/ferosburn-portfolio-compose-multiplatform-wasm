package ui.about

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import ui.components.VerticalPagerSideNavigation

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AboutPage() {
    val pagerState = rememberPagerState(pageCount = { 2 })
    val coroutineScope = rememberCoroutineScope()

    val toPage: (Int) -> Unit = { value ->
        coroutineScope.launch {
            pagerState.animateScrollToPage(value)
        }
    }

    Box(Modifier.fillMaxWidth()) {
        VerticalPager(state = pagerState) { page ->
            when (page) {
                0 -> Profile()
                1 -> AboutPortfolio()
            }
        }

        VerticalPagerSideNavigation(
            Modifier.align(Alignment.CenterEnd).padding(end = 24.dp),
            pagerState,
            toPage
        )
    }
}