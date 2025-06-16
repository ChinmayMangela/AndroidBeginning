package com.example.androidbeginning.ui.buttons

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun OutlineButtonExample() {
    var dialogState by remember {
        mutableStateOf(false)
    }
    Column {
        OutlinedButton(onClick = { dialogState = true }) {
            Text("Outline Button")
        }

        if(dialogState) {
            AlertDialog(
                onDismissRequest = {
                    dialogState = false
                },
                title = { Text("Delete An Phone number") },
                text =
                    { Text("Are you sure you want to delete this phone number?") },
                confirmButton = {
                    OutlinedButton(onClick = {
                        dialogState = false
                    }) {
                        Text("Delete")
                    }
                }
            )
        }

    }
}