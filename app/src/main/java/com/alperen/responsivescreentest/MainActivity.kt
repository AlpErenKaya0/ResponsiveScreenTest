package com.alperen.responsivescreentest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.alperen.responsivescreentest.ui.theme.AppTheme
import com.alperen.responsivescreentest.ui.theme.AppTheme.dimens
import com.alperen.responsivescreentest.ui.theme.ResponsiveScreenTestTheme
import com.alperen.responsivescreentest.ui.theme.Orientation
import com.alperen.responsivescreentest.ui.theme.rememberWindowSizeClass
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val window = rememberWindowSizeClass()
            ResponsiveScreenTestTheme(windowSizeClass = window) {
                if(AppTheme.orientation == Orientation.Portrait){
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription = "img1",
                                modifier = Modifier
                                    .clip(
                                        RoundedCornerShape(
                                            bottomEnd = dimens.medium,
                                            bottomStart = dimens.medium
                                        )
                                    )
                                    .fillMaxWidth(),
                                contentScale = ContentScale.FillWidth
                            )
                            Text(
                                "Welcome",
                                style = typography.bodyLarge,
                                color = Color.White
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(dimens.large)
                        ){
                            Text(
                                "This Application supports all screen sizes and landscape mode",
                                style = typography.bodyMedium,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                "You can have the maximum flexibility regarding your UI using this approach",
                                style = typography.bodyMedium,
                                textAlign = TextAlign.Center
                            )
                        }
                        Button(
                            onClick = {

                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Blue,
                                contentColor = Color.White
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(dimens.mediumLarge),
                            shape = CircleShape
                        ) {
                            Text(
                                text = "Lets go",
                                style = typography.bodyMedium,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .padding(dimens.medium)
                            )
                        }
                    }
                }else{
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painterResource(id = R.drawable.ic_launcher_foreground),
                                contentDescription = "img2",
                                modifier = Modifier
                                    .clip(RoundedCornerShape(
                                        topEnd = dimens.medium,
                                        bottomEnd = dimens.medium
                                    ))
                                    .fillMaxHeight(),
                                contentScale = ContentScale.FillHeight
                            )
                            Text(
                                "Welcome",
                                style = typography.bodyMedium,
                                color = Color.White
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(2f)
                                .padding(dimens.mediumLarge),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(
                                "This Application supports all screen sizes and landscape mode",
                                style = typography.displaySmall,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                "You can have the maximum flexibility regarding your UI using this approach",
                                style = typography.bodyLarge,
                                textAlign = TextAlign.Center
                            )
                            Button(
                                onClick = {

                                },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Blue,
                                    contentColor = Color.White
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(dimens.mediumLarge),
                                shape = CircleShape
                            ) {
                                Text(
                                    text = "Lets go",
                                    style = typography.bodyMedium,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier
                                        .padding(dimens.medium)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}