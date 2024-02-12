package utils

import kotlinx.browser.window

fun openLinkToNewTab(link: String) {
    window.open(link, "_blank")
}