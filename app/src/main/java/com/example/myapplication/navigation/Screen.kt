package com.example.myapplication.navigation

sealed class Screen(val route: String) {
    data object Home : Screen(route = "home_page")


    data class Detail(val itemId: String) : Screen(route = "detail_page/{itemId}") {
        fun buildRoute(): String {
            return route.replace(oldValue = "{itemId}", newValue = itemId)
        }
    }
}