package com.example.androidbeginning.ui.buttons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidbeginning.ui.theme.Black
import com.example.androidbeginning.ui.theme.Tan
import com.example.androidbeginning.ui.theme.White
import com.example.androidbeginning.ui.theme.buttonBackgroundColors
import com.example.androidbeginning.ui.theme.defaultColor
import com.example.androidbeginning.ui.theme.whitishColors
import java.util.Random

@Preview
@Composable
fun FilledButtonExample() {

    var backgroundColor by remember {
        mutableStateOf(defaultColor)
    }
    Button(
        onClick = {
            backgroundColor = buttonBackgroundColors[Random().nextInt(buttonBackgroundColors.size)]
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = if(whitishColors.contains(backgroundColor)) Black else White
        )
    ) {
        Text("Filled Button")
    }
}