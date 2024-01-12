package com.gclewis.playtime

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.gov.playtime.R

class ComposeArticle {
    @Composable
    fun ArticleText(
        title: String,
        firstParagraph: String,
        secondParagraph: String,
        modifier: Modifier = Modifier
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = firstParagraph,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = secondParagraph,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )
        }
    }

    @Composable
    fun ArticleImage(
        title: String,
        firstParagraph: String,
        secondParagraph: String,
        modifier: Modifier = Modifier
    ) {
        val image = painterResource(R.drawable.bg_compose_background)

        Box {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )

            ArticleText(
                title = title,
                firstParagraph = firstParagraph,
                secondParagraph = secondParagraph
            )

        }
    }
}