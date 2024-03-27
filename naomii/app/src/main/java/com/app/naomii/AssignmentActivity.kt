

package com.app.naomii

import android.content.ClipData.Item
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.naomii.ui.theme.NaomiiTheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Assignment() {

    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
    ){
        item {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
//                horizontalAlignment = Alignment.CenterHorizontally
            ){
               Row (

               ){
                   Icon(imageVector = Icons.Default.Home, contentDescription = "")
                   Spacer(modifier = Modifier.width(94.dp))

                   Column {
                       Text(text = "Current Location")
                       Row {
                           Icon(imageVector = Icons.Default.LocationOn, contentDescription = "", )
                           Text(text = "Denpasar,Bali")
                       } 
                   }
                   Spacer(modifier = Modifier.width(115.dp))
                   Icon(imageVector = Icons.Default.Face, contentDescription = "")

               }







                Spacer(modifier = Modifier.height(50.dp))

                    Row {
                        Card (
//                            elevation = CardDefaults.cardElevation(35.dp),
//                    border = BorderStroke(1.dp, Color.Black),
                            modifier = Modifier
                                .size(150.dp)
                                .padding(3.dp)
                        )
                        {

                            Row {
                                androidx.compose.foundation.Image(
                                    painter = painterResource(id = R.drawable.moon),
                                    contentDescription = ""
                                )
                                Text(text = "Hotels",
                                    modifier = Modifier.padding(top = 20.dp))
                            }
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Card (
                            elevation = CardDefaults.cardElevation(35.dp),
//                    border = BorderStroke(1.dp, Color.Black)
                            modifier = Modifier.size(150.dp)
                        )
                        {

                            Row {
                                androidx.compose.foundation.Image(
                                    painter = painterResource(id = R.drawable.moon),
                                    contentDescription = ""
                                )
                                Text(text = "Holiday",
                                    modifier = Modifier.padding(top = 20.dp))
                            }
                        }
                    }


                    Spacer(modifier = Modifier.height(14.dp))


                    Row {
                        Card (
                            elevation = CardDefaults.cardElevation(35.dp),
//                    border = BorderStroke(1.dp, Color.Black),
                            modifier = Modifier.size(150.dp)

                        )
                        {

                            Row {
                                androidx.compose.foundation.Image(
                                    painter = painterResource(id = R.drawable.road),
                                    contentDescription = ""
                                )
                                Text(text = "Taxi",
                                    modifier = Modifier.padding(top = 20.dp))

                            }



                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Card (
                            elevation = CardDefaults.cardElevation(35.dp),
//                    border = BorderStroke(1.dp, Color.Black),
                            modifier = Modifier.size(150.dp)

                        )
                        {

                            Row {
                                androidx.compose.foundation.Image(
                                    painter = painterResource(id = R.drawable.road),
                                    contentDescription = ""
                                )
                                Text(text = "Ticket",
                                    modifier = Modifier.padding(top = 20.dp))

                            }



                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))


                    Row {
                        Card (
                            elevation = CardDefaults.cardElevation(35.dp),
//                    border = BorderStroke(1.dp, Color.Black),
                            modifier = Modifier.size(150.dp)

                        )
                        {

                            Row {
                                androidx.compose.foundation.Image(
                                    painter = painterResource(id = R.drawable.roblox),
                                    contentDescription = ""
                                )
                                Text(text = "Airplane",
                                    modifier = Modifier.padding(top = 20.dp))

                            }



                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Card (
                            elevation = CardDefaults.cardElevation(35.dp),
//                    border = BorderStroke(1.dp, Color.Black),
                            modifier = Modifier.size(150.dp)

                        )
                        {

                            Row {
                                androidx.compose.foundation.Image(
                                    painter = painterResource(id = R.drawable.wall),
                                    contentDescription = ""
                                )
                                Text(text = "Harbour",
                                    modifier = Modifier.padding(top = 20.dp))

                            }



                        }
                    }

            }
            LazyColumn {
                item {
                    Row {
                        Text(text = "Popular in Town")
                        Spacer(modifier = Modifier.width(187.dp))
                        Text(text = "View all", color = Color.Cyan)
                    }
                    Spacer(modifier = Modifier.height(30.dp))
                    Row {
                        Spacer(modifier = Modifier.width(20.dp))
                        Card (
                            elevation = CardDefaults.cardElevation(35.dp),
//                    border = BorderStroke(1.dp, Color.Black),
                            modifier = Modifier.size(150.dp)

                        )
                        {

                            Row {
                                androidx.compose.foundation.Image(
                                    painter = painterResource(id = R.drawable.road),
                                    contentDescription = ""
                                )
                                Text(text = "Ticket",
                                    modifier = Modifier.padding(top = 20.dp))

                            }



                        }
                    }


                }
                }
               
            }
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
                }
   
    
    
    
    
   
}


