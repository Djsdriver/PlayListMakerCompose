package com.example.playlistmakercompose.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.playlistmakercompose.R
import com.example.playlistmakercompose.routes.Routes
import kotlin.reflect.typeOf


@Composable
fun SettingScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Настройки", color = Color.Black)
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(route = Routes.MainScreen.route) }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_arrow_back),
                            "backIcon", tint = Color.Black
                        )
                    }
                },
                backgroundColor = Color.White,
                contentColor = Color.White,
                elevation = 10.dp
            )
        }, content = {
            Column() {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Темная тема")
                    val checkedState = remember { mutableStateOf(false) }
                    Switch(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it },
                    )
                }

                ItemsSettingScreen(
                    text = "Поделиться приложением",
                    painter = painterResource(id = R.drawable.ic_baseline_share),
                    textDescription = "Share",
                    intent = Intent(Intent.ACTION_SEND)
                        .setType("text/plain")
                        .putExtra(Intent.EXTRA_TEXT, "https://practicum.yandex.ru/")
                )

                ItemsSettingScreen(
                    text = "Написать в поддержку",
                    painter = painterResource(id = R.drawable.ic_baseline_support),
                    textDescription = "Support",
                    intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"))
                        .putExtra(Intent.EXTRA_EMAIL, arrayOf("alexei.gra4ev@gmail.com"))
                        .putExtra(Intent.EXTRA_SUBJECT, "getString(R.string.TEXT_EXTRA_SUBJEC)")
                        .putExtra(Intent.EXTRA_TEXT, "getString(R.string.BODY_EXTRA_TEXT)")
                )


                ItemsSettingScreen(
                    text = "Пользовательское соглашение",
                    painter = painterResource(id = R.drawable.ic_baseline_navigate_next),
                    textDescription = "Next",
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
                )

            }

        })
}


@Composable
private fun ItemsSettingScreen(
    text: String, painter: Painter, textDescription: String, intent: Intent
) {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = text)
        IconButton(onClick = { context.startActivity(intent) }) {
            Icon(
                painter = painter,
                contentDescription = textDescription, tint = Color(0xFFAEAFB4)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PrevSettingScreens() {
    SettingScreen(rememberNavController())

}

/*
//функция с обработкой перехода экранов
@Composable
private fun ItemsSettingScreen(
    text: String, painter: Painter, textDescription: String,
    navController: NavController, screen: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = text)
        IconButton(onClick = { navController.navigate(route = screen) }) {
            Icon(
                painter = painter,
                contentDescription = textDescription, tint = Color(0xFFAEAFB4)
            )
        }
    }
}*/
