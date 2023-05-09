package com.simplit.dynamicthemesample.model

import androidx.compose.material.Colors
import androidx.compose.material.lightColors

data class ColorPalette(
    val lightModeColors: Colors = DefaultLightColorPalette,
    val darkModeColors: Colors = lightModeColors
) {
    companion object {
        internal val DefaultLightColorPalette: Colors = lightColors()
    }
}
