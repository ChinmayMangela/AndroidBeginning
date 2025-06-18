package com.example.androidbeginning.projects.auth.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidbeginning.projects.auth.components.AuthButton
import com.example.androidbeginning.projects.auth.components.AuthTextField
import com.example.androidbeginning.projects.auth.components.Heading
import com.example.androidbeginning.projects.constants.*

@Composable
fun SignInScreen(modifier: Modifier = Modifier) {
    var scrollState = rememberScrollState()
    Column(
        modifier = modifier.verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Heading(signInHeading)
        Spacer(Modifier.height(25.dp))
        EmailField()
        Spacer(Modifier.height(10.dp))
        PasswordField()
        Spacer(Modifier.height(10.dp))
        ForgotPasswordButton()
        Spacer(Modifier.height(10.dp))
        SignInButton()
    }
}

@Composable
private fun EmailField() {
    var emailText by remember {
        mutableStateOf("")
    }
    AuthTextField(
        textFieldValue = emailText,
        onValueChange = { it -> emailText = it },
        textFieldName = emailField,
        isPasswordField = false,
    )
}

@Composable
private fun PasswordField() {
    var passwordText by remember {
        mutableStateOf("")
    }

    var showPassword by remember {
        mutableStateOf(false)
    }

    AuthTextField(
        textFieldValue = passwordText,
        onValueChange = {it -> passwordText = it},
        isPasswordField = true,
        textFieldName = passwordField,
        showPassword = showPassword,
        togglePasswordState = {showPassword = !showPassword}
    )
}

@Composable
private fun ForgotPasswordButton() {
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

@Composable
fun SignInButton() {
    AuthButton(
        onClick = {},
        label = signInHeading
    )
}