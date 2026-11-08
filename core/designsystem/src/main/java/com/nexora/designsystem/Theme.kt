package com.nexora.designsystem

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val NexoraColors = darkColorScheme(
    primary = Color(0xFF8B9CFF),
    onPrimary = Color(0xFF10142A),
    secondary = Color(0xFF65D6CE),
    onSecondary = Color(0xFF06201E),
    background = Color(0xFF090B12),
    onBackground = Color(0xFFE9ECF5),
    surface = Color(0xFF121622),
    onSurface = Color(0xFFE9ECF5),
    surfaceVariant = Color(0xFF202638),
    onSurfaceVariant = Color(0xFFB8C0D4),
    error = Color(0xFFFF6B75)
)

@Composable
fun NexoraTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = NexoraColors,
        content = content
    )
}
