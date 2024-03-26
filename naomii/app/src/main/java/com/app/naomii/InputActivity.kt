package com.app.naomii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.naomii.ui.theme.NaomiiTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input() {
  Box (
      modifier = Modifier
          .fillMaxSize()

  ){
      androidx.compose.foundation.Image(
          painter = painterResource(id = R.drawable.red),
          contentDescription = "",
          modifier = Modifier
              .fillMaxSize(),
          contentScale = ContentScale.Crop

      )


      Column(
          modifier = Modifier
//              .background(Color.LightGray)
              .padding(11.dp)
              .fillMaxSize(),

          horizontalAlignment = Alignment.CenterHorizontally
      ) {

          var name by remember {
              mutableStateOf(TextFieldValue(""))
          }
          OutlinedTextField(
              value = name,
              onValueChange = { name = it },
              label = {Text(text = "Enter name")}

          )



          Spacer(modifier = Modifier.height(14.dp))


          var email by remember {
              mutableStateOf(TextFieldValue(""))
          }
          OutlinedTextField(
              value = email,
              onValueChange = {email = it},
              leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
//              label = {Text(text = "Email Address")},
              keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
              textStyle = TextStyle(Color.White)
          )

          Spacer(modifier = Modifier.height(14.dp))


          var phone by remember {
              mutableStateOf(TextFieldValue(""))
          }
          OutlinedTextField(
              value = phone,
              onValueChange = {phone = it},
//              label = {Text(text = "Telephone No.")},
              leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "")},
              keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
              colors = TextFieldDefaults.outlinedTextFieldColors(
                  focusedBorderColor = Color.Green,
                  unfocusedBorderColor = Color.Red,
                  focusedLabelColor = Color.Green,
                  unfocusedLabelColor = Color.Red,
                  cursorColor = Color.Magenta,
                  unfocusedLeadingIconColor = Color.Red
              )
          )

      }









   }
}



