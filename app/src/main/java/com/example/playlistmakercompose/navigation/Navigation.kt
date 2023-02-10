package com.example.playlistmakercompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.playlistmakercompose.routes.Routes


@Composable
fun Navigation(){
    val navController =rememberNavController()

    NavHost(navController = navController,  startDestination = Routes.SettingScreen.route ) {
           composable(Routes.SettingScreen.route){

           }
    }
}