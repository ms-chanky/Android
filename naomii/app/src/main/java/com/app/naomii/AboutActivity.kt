package com.app.naomii

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.naomii.ui.theme.NaomiiTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()
           
        }
    }
}
@Preview(showBackground = true)
@Composable
fun About() {


    LazyColumn (

      modifier = Modifier
          .background(Color.DarkGray)
          .fillMaxWidth()
          .fillMaxHeight()
          .padding(10.dp),
//          .fillMaxSize()

//       verticalArrangement = Arrangement.Center,
//       horizontalAlignment = Alignment.CenterHorizontally





   ){
      item {

          Row (
              verticalAlignment = Alignment.CenterVertically,
              horizontalArrangement = Arrangement.SpaceEvenly,

              modifier = Modifier
                  .background(Color.Magenta)
                  .fillMaxSize()

          ){
              Text(text = "Chats")
              Spacer(modifier = Modifier.width(12.dp))

              Text(text = "Status")
              Spacer(modifier = Modifier.width(12.dp))

              Text(text = "Calls")
              Spacer(modifier = Modifier.width(12.dp))

          }

          Spacer(modifier = Modifier.height(22.dp))

          Text(text = "About Us", color = Color.Blue, fontSize = 25.sp, fontFamily = FontFamily.Cursive, modifier = Modifier.background(
              Color.DarkGray))

          Text(text = "Welcome to our about page", color = Color.Cyan, fontSize = 32.sp, fontFamily = FontFamily.Cursive, modifier = Modifier.background(
              Color.Gray))

          val home = LocalContext.current
          Button(onClick = { home.startActivity(Intent(home, MainActivity::class.java))
          },
//              colors = ButtonDefaults.buttonColors(Color.Black),
//              shape = RectangleShape
//              shape = RoundedCornerShape(10.dp)
              shape = CutCornerShape(10),

              border = BorderStroke(1.dp, Color.Black),
              colors = ButtonDefaults.outlinedButtonColors(Color.Transparent)


          ) {
              Text(text = "Home Screen" , color = Color.White)

          }

          val text = AnnotatedString("Already have an account? Click here to log in.")

          val ll = LocalContext.current

         ClickableText(text =text , onClick = {

          ll.startActivity(Intent(ll, MainActivity::class.java))
         })



          }
          

      }
       
       
       
   }
    



