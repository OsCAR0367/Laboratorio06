package com.example.laboratorio06

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview(showBackground = true)
@Composable
fun UserProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "User Profile",
            fontSize = 24.sp,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = "Welcome to the user profile screen!",
            fontSize = 18.sp,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
