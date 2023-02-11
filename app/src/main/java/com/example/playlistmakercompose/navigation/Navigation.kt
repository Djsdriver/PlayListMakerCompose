package com.example.playlistmakercompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.playlistmakercompose.routes.Routes
import com.example.playlistmakercompose.screens.MainScreen
import com.example.playlistmakercompose.screens.MediaScreen
import com.example.playlistmakercompose.screens.SearchScreen
import com.example.playlistmakercompose.screens.SettingScreen


@Composable
fun Navigation(){
    val navController =rememberNavController()

    NavHost(navController = navController,  startDestination = Routes.MainScreen.route ) {
           composable(Routes.MainScreen.route){ MainScreen(navController = navController)}
           composable(Routes.SettingScreen.route){ SettingScreen(navController = navController)}
           composable(Routes.MediaScreen.route){ MediaScreen(navController = navController) }
           composable(Routes.SearchScreen.route){ SearchScreen(navController = navController)}
    }
}