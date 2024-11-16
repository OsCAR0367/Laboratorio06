package com.example.laboratorio06

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun CustomFAB(onIncrement: () -> Unit) {
    FloatingActionButton(
        onClick = { onIncrement() }
    ) {
        Text(
            fontSize = 24.sp,
            text = "+"
        )
    }
}