package com.example.androidbeginning.projects.auth.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun Heading(
    heading: String
) {
    Text(heading, fontSize = MaterialTheme.typography.displayLarge.fontSize, fontWeight = FontWeight.ExtraBold)
}