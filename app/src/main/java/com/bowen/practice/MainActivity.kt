package com.bowen.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bowen.practice.ui.theme.PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           
                    Greeting()
                }
            }
        }
    

@Composable
fun Greeting() {
    
    Column {
        Text(text = "This is the first android project")
        Text(text = "yyyyyyyyyyyyyyyyyyyyyyyyyy")
        Text(text = "greytu7tttttttttt")
    }
    
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        Greeting()
    }
