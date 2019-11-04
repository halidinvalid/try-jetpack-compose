package com.halidinvalid.jetpack.compose.button

import androidx.compose.Composable
import androidx.ui.material.Button
import androidx.ui.material.ButtonStyle
import androidx.ui.material.ContainedButtonStyle

@Composable
fun SignUpButton(
    text: String,
    onclick: () -> Unit,
    style: ButtonStyle = ContainedButtonStyle()
) {
    Button(
        text = text,
        onClick = onclick
    )
}