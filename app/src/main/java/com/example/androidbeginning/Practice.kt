package com.example.androidbeginning

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch(context = Dispatchers.IO) {
        val result = doNetworkCall()
        println("Hello World")

        @Composable
        fun DummyText() {
            Text(text = result)
        }
    }

}

suspend fun doNetworkCall(): String {
    delay(1000)
    return "Here is the result"
}