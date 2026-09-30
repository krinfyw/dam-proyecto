package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.navigation.Screen
import com.example.myapplication.ui.screens.AsistenteLoginScreen
import com.example.myapplication.ui.screens.DocenteLoginScreen
import com.example.myapplication.ui.screens.HomeScreen
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Screen.Home.route
                ) {
                    composable(Screen.Home.route) {
                        HomeScreen(navController = navController)
                    }
                    composable(Screen.DocenteLogin.route) {
                        DocenteLoginScreen(navController = navController)
                    }
                    composable(Screen.AsistenteLogin.route) {
                        AsistenteLoginScreen(navController = navController)
                    }

                }
            }
        }
    }
}