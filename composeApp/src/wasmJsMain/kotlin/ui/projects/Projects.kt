package ui.projects

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.local.projectsData
import ui.components.ProjectsItem

@Composable
fun Projects() {
    val projects = projectsData

    Column(
        Modifier.fillMaxWidth().padding(24.dp, 96.dp, 24.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Projects", fontSize = 36.sp, color = MaterialTheme.colorScheme.onBackground)
        Spacer(Modifier.height(48.dp))
        LazyColumn(
            Modifier.widthIn(max = 1024.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(8.dp),
        ) {
            items(projects) { project ->
                ProjectsItem(project)
            }
        }
    }
}