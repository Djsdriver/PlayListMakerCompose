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
import androidx.navigation.NavController
import com.example.playlistmakercompose.MainActivity
import com.example.playlistmakercompose.R
import com.example.playlistmakercompose.routes.Routes


@Composable
fun MainScreen(navController: NavController) {
        Column(
                modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF3772E7))
                        .padding(16.dp)
        ) {
                Text(text = "PlayList Maker", modifier = Modifier.padding(bottom = 16.dp), fontSize = 16.sp)

                Button(
                        onClick = { navController.navigate(route = Routes.SearchScreen.route) },
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
                        onClick = { navController.navigate(route = Routes.MediaScreen.route) },
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
                        onClick = { navController.navigate(route = Routes.SettingScreen.route) },
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

@Composable
@Preview(showBackground = true)
fun PreviewMainScreen(){

}
