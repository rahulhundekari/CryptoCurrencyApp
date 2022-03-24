package com.example.cryptocurrencyapp.common.component

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun TopBar(
    title: String,
    color: Color = MaterialTheme.colors.primary,
    navigationIcon: @Composable() (() -> Unit)? = null
) {

    TopAppBar(
        title = { Text(text = title) },
        backgroundColor = color,
        navigationIcon = navigationIcon,

        )
}