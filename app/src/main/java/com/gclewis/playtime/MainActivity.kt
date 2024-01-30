package com.gclewis.playtime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.gclewis.playtime.ui.theme.PlayTimeTheme
import uk.gov.playtime.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayTimeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ExampleToRun()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PlayTimeTheme {
        ExampleToRun()
    }
}

@Composable
fun ExampleToRun() {
//    SimpleApp().Greeting("Fred")
//    HappyBirthday().GreetingImage(
//        stringResource(R.string.happy_birthday_text),
//        stringResource(R.string.happy_birthday_signature),
//    )
//    ComposeArticle().ArticleImage(
//        stringResource(R.string.compose_article_title),
//        stringResource(R.string.compose_article_para_1),
//        stringResource(R.string.compose_article_para_2),
//    )
//    TaskManager().CompleteImage(
//        stringResource(R.string.task_manager_completion),
//        stringResource(R.string.task_manager_congratulations),
//    )
//    Quadrant().Display(
//        stringResource(R.string.quadrant_title_1),
//        stringResource(R.string.quadrant_text_1),
//        stringResource(R.string.quadrant_title_2),
//        stringResource(R.string.quadrant_text_2),
//        stringResource(R.string.quadrant_title_3),
//        stringResource(R.string.quadrant_text_3),
//        stringResource(R.string.quadrant_title_4),
//        stringResource(R.string.quadrant_text_4),
//    )
//    BusinessCard().Display()
    DiceRoller().DiceWithButtonAndImage()
}