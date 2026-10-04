package com.example.lapilearn_grupo6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lapilearn_grupo6.navigation.Screen
import com.example.lapilearn_grupo6.ui.screens.AsistenteLoginScreen
import com.example.lapilearn_grupo6.ui.screens.CatalogoActividades
import com.example.lapilearn_grupo6.ui.screens.DocenteLoginScreen
import com.example.lapilearn_grupo6.ui.screens.HomeScreen
import com.example.lapilearn_grupo6.ui.theme.LapiLearn_grupo6Theme
import com.example.lapilearn_grupo6.ui.theme.LapiLearn_grupo6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LapiLearn_grupo6Theme {
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
                    composable(Screen.DocenteDashboard.route){
                        CatalogoActividades(navController)
                    }
                }
            }
        }
    }
}