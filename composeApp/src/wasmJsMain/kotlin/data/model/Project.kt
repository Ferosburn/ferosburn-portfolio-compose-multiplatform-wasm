package data.model

data class Project(
    val projectName: String,
    val links: List<Link>,
    val platform: String = "",
    val languages: List<Language> = listOf(),
    val frameworksLibraries: List<String> = listOf(),
    val date: String,
    val images: List<String> = listOf(),
    val description: String,
    val isHighlighted: Boolean = false,
)