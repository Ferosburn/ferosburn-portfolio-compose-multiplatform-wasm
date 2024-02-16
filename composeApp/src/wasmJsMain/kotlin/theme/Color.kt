package theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// color name based on ntc
val color_ochre = Color(0xFFCC7A2B)
val color_white = Color(0xFFFFFFFF)
val color_rob_roy = Color(0xFFFFD17B)
val color_cod_gray = Color(0xFF0D0D0D)
val color_concrete = Color(0xFFF3F3F3)
val color_corn_harvest = Color(0xFF8F6C17)
val color_tussock = Color(0xFFC69D49)
val color_sazerac = Color(0xFFFFF5E1)
val color_shark = Color(0xFF242424)

val color_tacao = Color(0xFFE3A471)
val color_copper_canyon = Color(0xFF6B2A00)
val color_brown = Color(0xFF904800)
val color_cloud = Color(0xFFCCCCCC)
val color_star_dust = Color(0xFF9E9E9E)
val color_storm_dust = Color(0xFF616161)
val color_black = Color(0xFF000000)

val LightColors = lightColorScheme(
    // primary
    primary = color_ochre,
    onPrimary = color_white,
    primaryContainer = color_rob_roy,
    onPrimaryContainer = color_cod_gray,
    inversePrimary = color_rob_roy,

    // secondary
//    secondary = ,
//    onSecondary = ,
//    secondaryContainer = ,
//    onSecondaryContainer = ,

    // tertiary
//    tertiary = ,
//    onTertiary = ,
//    tertiaryContainer = ,
//    onTertiaryContainer = ,

    // background
    background = color_white,
    onBackground = color_cod_gray,

    // surface
    surface = color_white,
    onSurface = color_cod_gray,
    surfaceVariant = color_sazerac,
    onSurfaceVariant = color_shark,
    surfaceTint = color_sazerac,
    inverseSurface = color_cod_gray,
    inverseOnSurface = color_white,

    // error
//    error = ,
//    onError = ,
//    errorContainer = ,
//    onErrorContainer = ,

    // other
    outline = color_corn_harvest,
    outlineVariant = color_tussock,
    scrim = color_black,
)

val DarkColors = darkColorScheme(
    // primary
    primary = color_tacao,
    onPrimary = color_copper_canyon,
    primaryContainer = color_brown,
    onPrimaryContainer = color_concrete,
    inversePrimary = color_brown,

    // secondary
//    secondary = ,
//    onSecondary = ,
//    secondaryContainer = ,
//    onSecondaryContainer = ,

    // tertiary
//    tertiary = ,
//    onTertiary = ,
//    tertiaryContainer = ,
//    onTertiaryContainer = ,

    // background
    background = color_cod_gray,
    onBackground = color_concrete,

    // surface
    surface = color_cod_gray,
    onSurface = color_concrete,
    surfaceVariant = color_shark,
    onSurfaceVariant = color_cloud,
    surfaceTint = color_shark,
    inverseSurface = color_concrete,
    inverseOnSurface = color_cod_gray,

    // error
//    error = ,
//    onError = ,
//    errorContainer = ,
//    onErrorContainer = ,

    // other
    outline = color_star_dust,
    outlineVariant = color_storm_dust,
    scrim = color_black,
)
