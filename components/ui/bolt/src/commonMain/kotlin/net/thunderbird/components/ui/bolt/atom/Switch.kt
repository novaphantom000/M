package net.thunderbird.components.ui.bolt.atom

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons as MaterialIcons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon as Material3Icon
import androidx.compose.material3.Switch as Material3Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.thunderbird.components.ui.bolt.PreviewWithThemes

@Composable
fun Switch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Material3Switch(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        // Material 3 Expressive: show a check mark inside the thumb when the switch is on.
        thumbContent = if (checked) {
            {
                Material3Icon(
                    imageVector = MaterialIcons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.size(SwitchDefaults.IconSize),
                )
            }
        } else {
            null
        },
    )
}

@Composable
@Preview(showBackground = true)
internal fun SwitchPreview() {
    PreviewWithThemes {
        Switch(
            checked = true,
            onCheckedChange = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SwitchDisabledPreview() {
    PreviewWithThemes {
        Switch(
            checked = true,
            onCheckedChange = {},
            enabled = false,
        )
    }
}
