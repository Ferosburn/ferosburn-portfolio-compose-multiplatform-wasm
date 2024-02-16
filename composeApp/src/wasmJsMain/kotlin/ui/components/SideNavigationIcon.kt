package ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.RadioButtonChecked
import androidx.compose.material.icons.outlined.RadioButtonUnchecked
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

@Composable
fun SideNavigationIcon(isChecked: Boolean) {
    if (isChecked) {
        Icon(Icons.Outlined.RadioButtonChecked, contentDescription = null)
    } else {
        Icon(Icons.Outlined.RadioButtonUnchecked, contentDescription = null)
    }
}