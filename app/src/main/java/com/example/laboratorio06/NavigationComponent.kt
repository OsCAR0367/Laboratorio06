package com.example.laboratorio06

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.laboratorio06.Screens.CustomContent
import com.example.laboratorio06.Screens.HomeScreen
import com.example.laboratorio06.Screens.SettingsScreen

@Composable
fun NavigationComponent(navController: NavHostController, padding: PaddingValues, count: Int) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen(padding, count) }
        composable("cart") { CustomContent(padding) }
        composable("settings") { SettingsScreen() }
        composable("profile") {UserProfileScreen()


        }
    }
}