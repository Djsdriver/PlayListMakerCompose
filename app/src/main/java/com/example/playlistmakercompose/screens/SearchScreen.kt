package com.example.playlistmakercompose.screens

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.playlistmakercompose.R
import com.example.playlistmakercompose.routes.Routes


@Composable
fun SearchScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Поиск", color = Color.Black)
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(route = Routes.MainScreen.route)
                    }) {
                        Icon(painter = painterResource(id = R.drawable.ic_arrow_back),
                            "backIcon", tint = Color.Black)
                    }
                },
                backgroundColor = Color.White,
                contentColor = Color.White,
                elevation = 10.dp
            )
        }, content = {

        })
}

