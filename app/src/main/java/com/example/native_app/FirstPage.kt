package com.example.native_app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun FirstPage(message: String,  navController: NavController) {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = message)

        Spacer(modifier = Modifier.height(16.dp))  // Space between the Text and the Button

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Go Back to Main Screen")
        }
    }
}
