package com.example.native_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigator()
        }
    }
}

@Composable
fun AppNavigator() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "main") {
        composable("main") {
            MainScreen(navController)
        }
        composable("firstPage/{message}") { backStackEntry ->
            val message = backStackEntry.arguments?.getString("message") ?: "No message"
            FirstPage(message, navController)
        }
    }
}


@Composable
fun MainScreen(navController: NavController) {
    val message = "Hello from MainScreen!"

    Button(onClick = {
        navController.navigate("firstPage/${message}")
    }) {
        Text("Navigate to First Page")
    }
}
