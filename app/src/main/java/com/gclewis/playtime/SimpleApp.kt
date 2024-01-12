package com.gclewis.playtime

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class SimpleApp {
    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Surface(color = Color.Cyan) {
            Text(
                text = "Hi, my name is: $name!",
                modifier = modifier.padding(24.dp)
            )
        }
    }
}