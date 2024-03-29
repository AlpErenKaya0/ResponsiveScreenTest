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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alperen.SecondScreenwithssdp
import com.alperen.responsivescreentest.ui.theme.AppTheme
import com.alperen.responsivescreentest.ui.theme.AppTheme.dimens
import com.alperen.responsivescreentest.ui.theme.ResponsiveScreenTestTheme
import com.alperen.responsivescreentest.ui.theme.Orientation
import com.alperen.responsivescreentest.ui.theme.rememberWindowSizeClass
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //NOT!!! dp yerine ssdp ile çalışma durumu da gözden geçirilebilinir.
        super.onCreate(savedInstanceState)
        setContent {
            val window = rememberWindowSizeClass()
            ResponsiveScreenTestTheme(windowSizeClass = window) {
                val navController = rememberNavController()
                NavHost(navController = navController,
                    startDestination = "main_screen") {
                   composable("main_screen") {
                       MainScreen(navController = navController)
                   } //MainScreen
                    composable("second_screen_with_ssdp") {
                    SecondScreenwithssdp(navController = navController)
                    }
                }
                val myState = remember { mutableStateOf("") }


            }
        }
    }
}