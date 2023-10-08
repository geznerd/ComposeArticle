package com.alqosbah.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alqosbah.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayedArticle()
                }
            }
        }
    }
}

@Composable
fun DisplayedArticle() {
    ShownArticle(
        imagepainter = painterResource(id = R.drawable.bg_compose_background),
        title = stringResource(id = R.string.title),
        body1 = stringResource(id = R.string.paragraph_2),
        body2 = stringResource(id = R.string.paragraph_1)
    )
}

@Composable
fun ShownArticle(
    imagepainter: Painter,
    title: String,
    body1: String,
    body2: String,
    modifier: Modifier = Modifier
) {

    val image = imagepainter
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Text(
            text = title,
            modifier = modifier
                // .fillMaxSize()
                .padding(16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
        Text(
            text = body1,
            modifier = Modifier
                //.fillMaxSize()
                .padding(start = 16.dp, end = 16.dp),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )
        Text(
            text = body2,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp, 16.dp, 16.dp, 16.dp),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify

        )
    }
}

