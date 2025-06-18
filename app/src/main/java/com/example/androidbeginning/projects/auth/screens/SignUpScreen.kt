package com.example.androidbeginning.projects.auth.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
        SignUpButton()
    }
}

@Composable
private fun EmailField() {
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
private fun PasswordField() {
    var password by remember {
        mutableStateOf("")
    }
    var showPassword by remember {
        mutableStateOf(false)
    }

    AuthTextField(
        textFieldValue = password,
        onValueChange = { it ->
            password = it
        },
        isPasswordField = true,
        textFieldName = passwordField,
        showPassword = showPassword,
        togglePasswordState = {
            showPassword = !showPassword
        }
    )
}

@Composable
fun ConfirmPasswordField() {
    var password by remember {
        mutableStateOf("")
    }
    var showPassword by remember {
        mutableStateOf(false)
    }
    AuthTextField(
        textFieldValue = password,
        onValueChange = { it ->
            password = it
        },
        isPasswordField = true,
        textFieldName = confirmPasswordField,
        showPassword = showPassword,
        togglePasswordState = {
            showPassword = !showPassword
        }
    )
}


@Composable
fun SignUpButton() {
    AuthButton(
        onClick = {},
        label = signUpHeading
    )
}
