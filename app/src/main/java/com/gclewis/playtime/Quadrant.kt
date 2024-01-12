package com.gclewis.playtime

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Quadrant {
    @Composable
    fun Display(
        title1: String, text1: String,
        title2: String, text2: String,
        title3: String, text3: String,
        title4: String, text4: String,
        modifier: Modifier = Modifier
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()) {
            Row(
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth(1f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight(1f)
                        .fillMaxWidth(0.5f)
                ) {
                    Panel(title1, text1, Color(0xFFEADDFF), modifier)
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight(1f)
                        .fillMaxWidth(1f)
                ) {
                    Panel(title2, text2, Color(0xFFD0BCFF), modifier)
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxHeight(1f)
                    .fillMaxWidth(1f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight(1f)
                        .fillMaxWidth(0.5f)
                ) {
                    Panel(title3, text3, Color(0xFFB69DF8), modifier)
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight(1f)
                        .fillMaxWidth(1f)
                ) {
                    Panel(title4, text4, Color(0xFFF6EDFF), modifier)
                }
            }
        }
    }

    @Composable
    fun Panel(title: String, text: String, color: Color, modifier: Modifier) {

        Column(
            modifier = Modifier.background(color = color)
                .fillMaxHeight(1f)
                .fillMaxWidth(1f)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(bottom = 8.dp)
            )
            Text(
                text = text,
                textAlign = TextAlign.Justify,
            )
        }
    }
}