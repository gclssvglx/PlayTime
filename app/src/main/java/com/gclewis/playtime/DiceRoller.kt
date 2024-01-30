package com.gclewis.playtime

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import uk.gov.playtime.R
import uk.gov.playtime.R.drawable.dice_1
import uk.gov.playtime.R.drawable.dice_2
import uk.gov.playtime.R.drawable.dice_3
import uk.gov.playtime.R.drawable.dice_4
import uk.gov.playtime.R.drawable.dice_5
import uk.gov.playtime.R.drawable.dice_6

class DiceRoller {
    @Composable
    fun DiceWithButtonAndImage(modifier: Modifier = Modifier
    ) {
        var result by remember { mutableStateOf(1) }

        val imageResource = when (result) {
            1 -> dice_1
            2 -> dice_2
            3 -> dice_3
            4 -> dice_4
            5 -> dice_5
            else -> dice_6
        }

        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = result.toString()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { result = (1..6).random() }) {
                Text(stringResource(R.string.dice_roller_roll))
            }
        }
    }
}