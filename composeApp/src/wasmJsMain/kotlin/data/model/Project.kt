package data.model

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
data class Project(
    val projectName: String,
    val links: List<Link>,
    val platform: String = "",
    val languages: List<Language> = listOf(),
    val frameworksLibraries: List<String> = listOf(),
    val date: String,
    val images: List<DrawableResource> = listOf(),
    val description: String,
    val isHighlighted: Boolean = false,
)