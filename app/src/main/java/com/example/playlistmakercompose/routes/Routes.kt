package com.example.playlistmakercompose.routes

// It contains route names to all three screens
sealed class Routes(val route: String) {
    object MainScreen : Routes("main_screen")
    object SettingScreen : Routes("setting_screen")
}
