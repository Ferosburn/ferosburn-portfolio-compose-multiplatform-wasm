package data.model

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

data class Language @OptIn(ExperimentalResourceApi::class) constructor(
    val name: String,
    val icon: DrawableResource
)