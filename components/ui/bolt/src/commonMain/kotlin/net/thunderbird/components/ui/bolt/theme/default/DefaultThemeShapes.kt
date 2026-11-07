package net.thunderbird.components.ui.bolt.theme.default

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import net.thunderbird.components.ui.bolt.theme.ThemeShapes

/**
 * Material 3 Expressive shape scale: softer, larger corners than the baseline Material 3 scale.
 */
val defaultThemeShapes = ThemeShapes(
    extraSmall = RoundedCornerShape(8.dp),
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(28.dp),
    extraLarge = RoundedCornerShape(36.dp),
)
