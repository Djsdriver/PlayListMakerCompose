package com.example.playlistmakercompose.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.playlistmakercompose.R


@Composable
@Preview(showBackground = true)
fun MainScreen() {
        Column(
                modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Blue)
                        .padding(16.dp)
        ) {
                Text(text = "PlayList Maker", modifier = Modifier.padding(bottom = 16.dp))

                Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                                .padding(bottom = 20.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black),
                        elevation = ButtonDefaults.elevation(
                                defaultElevation = 10.dp,
                                pressedElevation = 15.dp,
                                disabledElevation = 0.dp
                        )
                ) {
                        Image(
                                painter = painterResource(id = R.drawable.ic_search),
                                contentDescription = "Content description for visually impaired"
                        )
                        Text(text = "Поиск", fontSize = 16.sp, modifier = Modifier.padding(start = 5.dp))

                }
//button media
                Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                                .padding(bottom = 20.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black),
                        elevation = ButtonDefaults.elevation(
                                defaultElevation = 10.dp,
                                pressedElevation = 15.dp,
                                disabledElevation = 0.dp
                        )
                ) {
                        Image(
                                painter = painterResource(R.drawable.ic_media),
                                contentDescription = "Content description for visually impaired",
                        )
                        Text(text = "Медиа", fontSize = 16.sp,modifier = Modifier.padding(start = 5.dp))

                }

                //button setting
                Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                                .padding(bottom = 20.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black),
                        elevation = ButtonDefaults.elevation(
                                defaultElevation = 10.dp,
                                pressedElevation = 15.dp,
                                disabledElevation = 0.dp
                        )
                ) {
                        Image(
                                painter = painterResource(id = R.drawable.ic_setting),
                                contentDescription = "Content description for visually impaired",
                        )
                        Text(text = "Настройки", fontSize = 16.sp,modifier = Modifier.padding(start = 5.dp))

                }

        }
}
