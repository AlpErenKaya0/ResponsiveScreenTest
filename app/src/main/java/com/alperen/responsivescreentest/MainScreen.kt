package com.alperen.responsivescreentest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
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
import androidx.navigation.NavController
import com.alperen.responsivescreentest.ui.theme.AppTheme

@Composable
fun MainScreen (navController: NavController) {


    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "img1",
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            bottomEnd = AppTheme.dimens.medium,
                            bottomStart = AppTheme.dimens.medium
                        )
                    )
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Text(
                "Welcome",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(AppTheme.dimens.large)
        ) {
            Text(
                "This Application supports all screen sizes and landscape mode",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center
            )
            Text(
                "You can have the maximum flexibility regarding your UI using this approach",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center
            )
        }
        Button(
            onClick = {
                      navController.navigate(
                          "second_screen_with_ssdp"
                      )

            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(AppTheme.dimens.mediumLarge),
            shape = CircleShape
        ) {
            Text(
                text = "Lets go",
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(AppTheme.dimens.medium)
            )
        }
    }
}