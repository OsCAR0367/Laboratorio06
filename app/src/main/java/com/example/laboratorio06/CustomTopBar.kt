package com.example.laboratorio06


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(navController: NavHostController) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = {  }) {
                Icon(imageVector = Icons.Rounded.Menu, contentDescription = "Menu")
            }
        },
        title = { Text(text = "App Title") },
        actions = {
            IconButton(onClick = { navController.navigate("profile") }) {
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = "Profile"
                )
            }
        }
    )
}
