package com.gclewis.playtime

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.gov.playtime.R

class BusinessCard {
    @Composable
    fun Display(modifier: Modifier = Modifier) {
        Surface(color = Color(0xFFD6E7D6)) {
            val image = painterResource(R.drawable.android_logo)

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier,
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .background(color = Color(0xFF133040)
                    )
                )

                Text(
                    text = "Jennifer Doe",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Light,
                    modifier = modifier.padding(10.dp)
                )

                Text(
                    text = "Android Developer Extraordinaire",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF457B54),
                    modifier = modifier.padding(bottom = 150.dp)
                )

                Text(
                    text = "+11 (123) 444 555 666",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Left,
                    modifier = modifier.padding(8.dp)
                )

                Text(
                    text = "@AndroidDev",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Left,
                    modifier = modifier.padding(8.dp)
                )

                Text(
                    text = "jen.doe@android.com",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Left,
                    modifier = modifier.padding(8.dp)
                )
            }
        }
    }
}
