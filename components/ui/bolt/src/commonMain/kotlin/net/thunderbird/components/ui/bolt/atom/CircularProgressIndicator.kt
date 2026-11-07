package net.thunderbird.components.ui.bolt.atom

import androidx.compose.material3.CircularWavyProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.LoadingIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import net.thunderbird.components.ui.bolt.PreviewWithThemes
import net.thunderbird.components.ui.bolt.theme.BoltTheme

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun CircularProgressIndicator(
    progress: () -> Float,
    modifier: Modifier = Modifier,
    color: Color = ProgressIndicatorDefaults.circularColor,
) {
    CircularWavyProgressIndicator(
        progress = progress,
        modifier = modifier,
        color = color,
    )
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun CircularProgressIndicator(
    modifier: Modifier = Modifier,
    color: Color = ProgressIndicatorDefaults.circularColor,
) {
    LoadingIndicator(
        modifier = modifier,
        color = color,
    )
}

@Composable
@Preview(showBackground = true)
internal fun CircularProgressIndicatorPreview() {
    PreviewWithThemes {
        CircularProgressIndicator(
            progress = { 0.75f },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun CircularProgressIndicatorColoredPreview() {
    PreviewWithThemes {
        CircularProgressIndicator(
            progress = { 0.75f },
            color = BoltTheme.colors.secondary,
        )
    }
}
