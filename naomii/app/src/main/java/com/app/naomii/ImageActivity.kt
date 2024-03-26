package com.app.naomii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.naomii.ui.theme.NaomiiTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Image()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Image() {
    Column (
        modifier = Modifier
            .background(Color.Cyan)
            .padding()
            .fillMaxSize(),
//        horizontalAlignment = Alignment.Start
    ){

        androidx.compose.foundation.Image(
            painter = painterResource(id = R.drawable.roblox),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(60))
                .size(200.dp),
            contentScale = ContentScale.None,

//            colorFilter = ColorFilter.tint(Color.Gray)

        )











    }

}

