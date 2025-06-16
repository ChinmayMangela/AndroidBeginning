package com.example.androidbeginning.ui.buttons

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.w3c.dom.Text

@Composable
fun TextButtonExample(modifier: Modifier = Modifier) {
    TextButton(
        onClick = {}
    ) {
        Text("Text Button")
    }
}