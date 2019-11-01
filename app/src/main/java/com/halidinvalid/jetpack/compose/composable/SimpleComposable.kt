package com.halidinvalid.jetpack.compose.composable

import androidx.compose.Composable
import androidx.ui.material.MaterialTheme
import com.halidinvalid.jetpack.compose.text.HeaderText

@Composable
fun SimpleComposable() {
    MaterialTheme {
        HeaderText(text = "Simple Composable")
    }
}