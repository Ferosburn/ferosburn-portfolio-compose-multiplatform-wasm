package ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.RadioButtonChecked
import androidx.compose.material.icons.outlined.RadioButtonUnchecked
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VerticalPagerSideNavigation(
    modifier: Modifier = Modifier,
    pagerState: PagerState,
    toPage: (Int) -> Unit = {}
) {
    Card(modifier) {
        LazyColumn(horizontalAlignment = Alignment.CenterHorizontally) {
            items(pagerState.pageCount) { pageIndex ->
                IconButton({ toPage(pageIndex) }) {
                    if (pagerState.currentPage == pageIndex) {
                        Icon(Icons.Outlined.RadioButtonChecked, contentDescription = null)
                    } else {
                        Icon(Icons.Outlined.RadioButtonUnchecked, contentDescription = null)
                    }
                }
                if (pageIndex < pagerState.pageCount - 1) {
                    Icon(
                        Icons.Outlined.MoreVert,
                        contentDescription = null,
                        Modifier.align(Alignment.CenterHorizontally)
                    )
                }
            }
        }
    }
}