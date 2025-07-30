package com.heartbridgeconnections.Android.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun ThriveCheckAITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        darkColorScheme(
            primary = Purple200,
            onPrimary = Black,
            primaryContainer = Purple700,
            secondary = Teal200,
            onSecondary = White,
            background = Black,
            onBackground = White,
            surface = Black,
            onSurface = White
        )
    } else {
        lightColorScheme(
            primary = Purple500,
            onPrimary = White,
            primaryContainer = Purple700,
            secondary = Teal200,
            onSecondary = Black,
            background = White,
            onBackground = Black,
            surface = White,
            onSurface = Black
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
