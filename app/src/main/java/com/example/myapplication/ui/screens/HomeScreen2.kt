package com.example.myapplication.ui.screens

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.utils.obtenerWindowSizeClass

@Composable
fun HomeScreen2(){
    val windowSizeClass = obtenerWindowSizeClass()
    when (windowSizeClass.widthSizeClass){
        WindowWidthSizeClass.Compact -> HomeScreenCompacta()
        WindowWidthSizeClass.Medium -> HomeScreenCompacta()
        WindowWidthSizeClass.Expanded -> HomeScreenCompacta()
    }
}

@Preview(name = "Compact", widthDp = 360, heightDp = 800)
@Composable
fun PreviewCompact(){
    HomeScreenCompacta()
}