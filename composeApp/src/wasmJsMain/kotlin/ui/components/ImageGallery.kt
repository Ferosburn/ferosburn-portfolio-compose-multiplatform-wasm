package ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChevronLeft
import androidx.compose.material.icons.outlined.ChevronRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalFoundationApi::class, ExperimentalResourceApi::class)
@Composable
fun ImageGallery(
    images: List<DrawableResource>,
    modifier: Modifier = Modifier
) {
    val pagerState = rememberPagerState(pageCount = { images.size })
    val coroutineScope = rememberCoroutineScope()

    val nextImage: () -> Unit = {
        val page = pagerState.currentPage
        if (page < pagerState.pageCount) {
            coroutineScope.launch {
                pagerState.animateScrollToPage(page + 1)
            }
        }
    }

    val prevImage: () -> Unit = {
        val page = pagerState.currentPage
        if (page >= 0) {
            coroutineScope.launch {
                pagerState.animateScrollToPage(page - 1)
            }
        }
    }

    Box(modifier) {
        if (images.isNotEmpty()) {
            HorizontalPager(pagerState, userScrollEnabled = false) { page ->
                Image(
                    painterResource(images[page]),
                    contentDescription = null,
                    Modifier.fillMaxSize().background(MaterialTheme.colorScheme.surfaceTint),
                )
            }

            if (pagerState.currentPage > 0) {
                Button(
                    prevImage,
                    Modifier.fillMaxHeight().align(Alignment.CenterStart),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = MaterialTheme.colorScheme.onSurface,
                    ),
                    contentPadding = PaddingValues(0.dp),
                    shape = RectangleShape,
                ) {
                    InfoTooltipBox("Prev", Modifier.fillMaxHeight()) {
                        Icon(
                            Icons.Outlined.ChevronLeft,
                            contentDescription = "previous",
                            Modifier.fillMaxHeight().padding(horizontal = 2.dp)
                                .align(Alignment.CenterVertically)
                        )
                    }
                }
            }

            if (pagerState.currentPage < pagerState.pageCount - 1) {
                Button(
                    nextImage,
                    Modifier.fillMaxHeight().align(Alignment.CenterEnd),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = MaterialTheme.colorScheme.onSurface,
                    ),
                    contentPadding = PaddingValues(0.dp),
                    shape = RectangleShape,
                ) {
                    InfoTooltipBox("Next", Modifier.fillMaxHeight()) {
                        Icon(
                            Icons.Outlined.ChevronRight,
                            contentDescription = "next",
                            Modifier.fillMaxHeight().padding(horizontal = 2.dp)
                                .align(Alignment.CenterVertically)
                        )
                    }
                }
            }
        } else {
            Text("No image available", Modifier.align(Alignment.Center))
        }
    }
}