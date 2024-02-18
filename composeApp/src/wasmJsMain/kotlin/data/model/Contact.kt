package data.model

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

data class Contact @OptIn(ExperimentalResourceApi::class) constructor(
    val label: String,
    val link: String,
    val icon: DrawableResource,
)
