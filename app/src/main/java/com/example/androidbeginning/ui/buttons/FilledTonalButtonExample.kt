package com.example.androidbeginning.ui.buttons

import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@Composable
fun FilledTonalButtonExample(
    snackBarHostState: SnackbarHostState
) {
    val scope = rememberCoroutineScope()
    FilledTonalButton(
        onClick = {
            scope.launch {
                snackBarHostState.showSnackbar("Filled Tonal Button is clicked", actionLabel = "Ok")
            }
        }
    ) {
        Text("Filled Tonal Button")
    }
}