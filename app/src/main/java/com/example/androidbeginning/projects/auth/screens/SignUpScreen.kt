package com.example.androidbeginning.projects.auth.screens

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidbeginning.projects.auth.components.AuthButton
import com.example.androidbeginning.projects.auth.components.AuthTextField
import com.example.androidbeginning.projects.auth.components.Heading
import com.example.androidbeginning.projects.constants.confirmPasswordField
import com.example.androidbeginning.projects.constants.emailField
import com.example.androidbeginning.projects.constants.forgotPassword
import com.example.androidbeginning.projects.constants.passwordField
import com.example.androidbeginning.projects.constants.signUpHeading

@Composable
fun SignUpScreen(modifier: Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .verticalScroll(scrollState)
            .imePadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Heading(signUpHeading)
        Spacer(Modifier.height(25.dp))
        EmailField()
        Spacer(Modifier.height(10.dp))
        PasswordField()
        Spacer(Modifier.height(10.dp))
        ConfirmPasswordField()
        Spacer(Modifier.height(10.dp))
        ForgotPasswordButton()
        Spacer(Modifier.height(10.dp))
        SignUpButton()
    }
}

@Composable
fun EmailField() {
    var email by remember {
        mutableStateOf("")
    }
    AuthTextField(
        textFieldValue = email,
        onValueChange = { it ->
            email = it
        },
        isPasswordField = false,
        textFieldName = emailField
    )
}

@Composable
fun PasswordField() {
    var password by remember {
        mutableStateOf("")
    }
    AuthTextField(
        textFieldValue = password,
        onValueChange = { it ->
            password = it
        },
        isPasswordField = true,
        textFieldName = passwordField
    )
}

@Composable
fun ConfirmPasswordField() {
    var password by remember {
        mutableStateOf("")
    }
    AuthTextField(
        textFieldValue = password,
        onValueChange = { it ->
            password = it
        },
        isPasswordField = true,
        textFieldName = confirmPasswordField
    )
}


@Composable
fun SignUpButton() {
    AuthButton(
        onClick = {},
        label = signUpHeading
    )
}

@Composable
fun ForgotPasswordButton() {
    Box(
        modifier =  Modifier.fillMaxWidth(),
        contentAlignment = Alignment.CenterEnd
    ) {
        TextButton(
            onClick = {}
        ) {
            Text(forgotPassword)
        }
    }
}