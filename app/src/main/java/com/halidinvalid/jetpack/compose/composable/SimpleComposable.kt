package com.halidinvalid.jetpack.compose.composable

import androidx.compose.Composable
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme
import com.halidinvalid.jetpack.compose.text.HeaderText

@Composable
fun SimpleComposable(headerText: String) {
    MaterialTheme {
        Column {
            HeaderText(text = headerText)

        }
    }
}