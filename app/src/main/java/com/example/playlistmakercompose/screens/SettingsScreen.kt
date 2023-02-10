package com.example.playlistmakercompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.playlistmakercompose.R


@Composable
@Preview(showBackground = true)
fun SettingScreen(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Настройки", color = Color.Black)
                },
                navigationIcon = {
                    IconButton(onClick = {/* обработчик*/}) {
                        Icon(painter = painterResource(id = R.drawable.ic_arrow_back),
                            "backIcon", tint = Color.Black)
                    }
                },
                backgroundColor = Color.White,
                contentColor = Color.White,
                elevation = 10.dp
            )
        }, content = {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(15.dp), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Сменить тему")
                val checkedState = remember { mutableStateOf(true) }
                Switch(checked = checkedState.value,
                    onCheckedChange = {checkedState.value=it},)
            }

        })
    }