import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DarkMode
import androidx.compose.material.icons.outlined.LightMode
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.browser.localStorage
import kotlinx.coroutines.launch
import theme.AppTheme
import ui.about.AboutPage
import ui.components.TopNavigationBar
import ui.home.HomePage
import ui.projects.ProjectsPage

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {
    // initial theme: getting theme value from browser's local storage
    val themeKey = "theme_key"
    val localThemeKeyValue: Boolean = localStorage.getItem(themeKey).toBoolean()
    var isDarkMode by remember { mutableStateOf(localThemeKeyValue) }

    val pagerState = rememberPagerState(pageCount = { 3 })
    val coroutineScope = rememberCoroutineScope()

    val toPage: (Int) -> Unit = { value ->
        coroutineScope.launch {
            pagerState.animateScrollToPage(value)
        }
    }

    val setTheme: () -> Unit = {
        isDarkMode = !isDarkMode
        localStorage.setItem(themeKey, isDarkMode.toString())
    }

    AppTheme(useDarkTheme = isDarkMode) {
        Box(Modifier.fillMaxWidth()) {
            HorizontalPager(
                modifier = Modifier.align(Alignment.Center).fillMaxHeight()
                    .background(MaterialTheme.colorScheme.background),
                state = pagerState
            ) { page ->
                when (page) {
                    0 -> HomePage()
                    1 -> ProjectsPage()
                    2 -> AboutPage()
                }
            }

            TopNavigationBar(
                Modifier.fillMaxWidth().padding(top = 16.dp),
                toPage = toPage,
            )

            Button(
                onClick = { setTheme() },
                Modifier.align(Alignment.TopEnd).padding(top = 16.dp, end = 24.dp)
            ) {
                if (isDarkMode) {
                    Icon(Icons.Outlined.DarkMode, contentDescription = "dark mode")
                } else {
                    Icon(Icons.Outlined.LightMode, contentDescription = "light mode")
                }
            }
        }
    }
}