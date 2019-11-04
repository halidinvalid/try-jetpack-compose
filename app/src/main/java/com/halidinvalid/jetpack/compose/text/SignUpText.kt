package com.halidinvalid.jetpack.compose.text

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.material.themeTextStyle
import androidx.ui.text.AnnotatedString
import androidx.ui.text.ParagraphStyle
import androidx.ui.text.TextStyle
import androidx.ui.text.style.TextAlign

@Composable
fun SignUpText(
    text: String,
    style: TextStyle = +themeTextStyle { h6 },
    paragraphStyle: ParagraphStyle = ParagraphStyle(TextAlign.Left)
) {
    Text(
        text = AnnotatedString(text),
        style = style,
        paragraphStyle = paragraphStyle
    )
}