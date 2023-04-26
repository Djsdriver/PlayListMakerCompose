package com.example.playlistmakercompose.screens

import android.widget.EditText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
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
            var text by remember { mutableStateOf(TextFieldValue()) }
            return@Scaffold OutlinedTextField(
                value = text,
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
                //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                onValueChange = {
                    text = it
                },
                label = { Text(text = "Email address") },
                placeholder = { Text(text = "Enter your e-mail") },
            )


        })
}

@Preview(showBackground = true)
@Composable
fun PrevSearchScreen() {
    SearchScreen(rememberNavController())

}

