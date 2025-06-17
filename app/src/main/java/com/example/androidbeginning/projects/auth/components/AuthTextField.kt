package com.example.androidbeginning.projects.auth.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.example.androidbeginning.projects.constants.emailField
import com.example.androidbeginning.projects.constants.passwordField

@Composable
fun AuthTextField(
    textFieldValue: String,
    onValueChange: (String) -> Unit,
    isPasswordField: Boolean = false,
    textFieldName: String
) {

    val leadingIcon = @Composable{
        Icon(
            imageVector = if(isPasswordField) Icons.Default.Lock else Icons.Default.Email,
            contentDescription = if(isPasswordField) "Password" else "Email"
        )
    }

    val label = @Composable {
        when(textFieldName) {
            emailField -> Text("Email")
            passwordField -> Text("Password")
            else -> Text("Confirm Password")
        }
    }



    TextField(
        modifier = Modifier.fillMaxWidth(),
        value = textFieldValue,
        onValueChange = onValueChange,
        leadingIcon = leadingIcon,
        label = label,
        visualTransformation = if(isPasswordField) PasswordVisualTransformation() else VisualTransformation.None,
        shape = RoundedCornerShape(7.dp),
        singleLine = true,
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent
        )

    )
}