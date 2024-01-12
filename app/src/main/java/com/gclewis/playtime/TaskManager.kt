package com.gclewis.playtime

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.gov.playtime.R

class TaskManager {
    @Composable
    fun CompleteText(completion: String, congratulations: String, modifier: Modifier = Modifier) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = completion,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 8.dp, bottom = 8.dp)
            )
            Text(
                text = congratulations,
                fontSize = 16.sp,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
            )
        }
    }

    @Composable
    fun CompleteImage(completion: String, congratulations: String, modifier: Modifier = Modifier) {
        val image = painterResource(R.drawable.ic_task_completed)

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
            CompleteText(
                completion = completion,
                congratulations = congratulations
            )
        }
    }
}
