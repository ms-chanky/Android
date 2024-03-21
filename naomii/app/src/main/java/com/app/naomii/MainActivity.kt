package com.app.naomii

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import com.app.naomii.ui.theme.NaomiiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    Greeting()
                }
            }
        }
@Preview(showBackground = true)
@Composable
fun Greeting() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Text(text = "This is the first android project", color = Color.White ,fontFamily = FontFamily.Cursive)
        Text(text = "Android", color = Color.Magenta, fontFamily = FontFamily.Cursive)
        Text(text = "Programming codes", color = Color.Cyan)

val about = LocalContext.current
        Button(onClick = {

            about.startActivity(Intent(about, AboutActivity::class.java))



        }) {
            Text(text = "About screen")
        }
    }

}

