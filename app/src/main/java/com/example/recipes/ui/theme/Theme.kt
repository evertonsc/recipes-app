package com.example.recipes.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Yellow500,
    primaryVariant = Yellow700,
    secondary = Brown900
)

private val LightColorPalette = lightColors(
    primary = Yellow500,
    primaryVariant = Yellow700,
    secondary = Brown900,
    background = LightBrown,
    surface = White,
    onPrimary = White,
    onSecondary = White,
    onBackground = Brown900,
    onSurface = Brown900
)

@Composable
fun YourAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
