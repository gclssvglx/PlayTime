package com.gclewis.playtime

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.gov.playtime.R

class Lemonade {
    @Composable
    fun Juice(modifier: Modifier = Modifier) {
        var step by remember { mutableStateOf(1) }
        var squeeze by remember { mutableStateOf(1) }
        var squeezeCount by remember { mutableStateOf(1) }

        val image = when (step) {
            1 -> R.drawable.lemon_tree
            2 -> R.drawable.lemon_squeeze
            3 -> R.drawable.lemon_drink
            else -> R.drawable.lemon_restart
        }

        val title = when (step) {
            1 -> R.string.lemonade_step_1
            2 -> R.string.lemonade_step_2
            3 -> R.string.lemonade_step_3
            else -> R.string.lemonade_step_4
        }

        val desc = when (step) {
            1 -> R.string.lemonade_step_1_desc
            2 -> R.string.lemonade_step_2_desc
            3 -> R.string.lemonade_step_3_desc
            else -> R.string.lemonade_step_4_desc
        }

        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(color = Color(0xFFCBEBD4))
                    .padding(20.dp)
                    .clickable {
                    println("Step: $step - Squeeze: $squeeze - Count: $squeezeCount")
                    when (step) {
                        1 -> {
                            squeeze = (2..4).random()
                            step++
                        }
                        2 -> {
                            squeezeCount++
                            if (squeezeCount > squeeze) {
                                step++
                            }
                        }
                        4 -> {
                            step = 1
                            squeezeCount = 1
                        }
                        else -> {
                            step++
                        }
                    }
                },
                painter = painterResource(id = image),
                contentDescription = desc.toString(),
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                stringResource(title),
                fontSize = 18.sp
            )
        }
    }
}