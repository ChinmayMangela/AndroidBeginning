package com.example.androidbeginning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidbeginning.ui.buttons.FilledButtonExample
import com.example.androidbeginning.ui.buttons.FilledTonalButtonExample
import com.example.androidbeginning.ui.buttons.OutlineButtonExample
import com.example.androidbeginning.ui.buttons.TextButtonExample
import com.example.androidbeginning.ui.theme.AndroidBeginningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBeginningTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    val snackBarHostState = remember {
        SnackbarHostState()
    }
    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackBarHostState)
        },
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(it),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FilledButtonExample()
            FilledTonalButtonExample(snackBarHostState)
            OutlineButtonExample()
            TextButtonExample()
        }
    }
}
