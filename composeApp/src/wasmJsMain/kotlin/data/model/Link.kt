package data.model

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

data class Link @OptIn(ExperimentalResourceApi::class) constructor(
    val icon: DrawableResource,
    val link: String,
    val description: String
)