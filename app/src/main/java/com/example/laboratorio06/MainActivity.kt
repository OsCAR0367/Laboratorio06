package com.example.laboratorio06



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.laboratorio06.Screens.HomeScreen
import com.example.laboratorio06.ui.theme.Laboratorio06Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio06Theme {
                CustomScaffold()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun CustomScaffold() {
    val navController = rememberNavController()
    var count by remember { mutableStateOf(0) }

    Scaffold(
        topBar = { CustomTopBar(navController) },
        bottomBar = { CustomBottomBar(navController) },
        floatingActionButton = { CustomFAB { count++ } },
        content = { padding ->
            NavigationComponent(navController, padding, count)
        }
    )
}

