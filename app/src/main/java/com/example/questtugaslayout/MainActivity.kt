package com.example.questtugaslayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(R.color.screen_background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = dimensionResource(R.dimen.screen_padding)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(dimensionResource(R.dimen.title_top_space)))
            Text(
                text = stringResource(R.string.title),
                color = colorResource(R.color.text_black),
                fontSize = dimensionResource(R.dimen.title_size).value.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(R.string.subtitle),
                color = colorResource(R.color.text_black),
                fontSize = dimensionResource(R.dimen.subtitle_size).value.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(Modifier.height(dimensionResource(R.dimen.section_space)))
        }
    }
}
@Composable
fun ProfileCard(
    name: String,
    address: String,
    backgroundColor: Color,
    addressColor: Color,
    modifier: Modifier = Modifier,
    nameColor: Color = colorResource(R.color.text_white),
    nameFontFamily: FontFamily? = null,
    nameFontWeight: FontWeight = FontWeight.Bold,
    nameFontSize: TextUnit = dimensionResource(R.dimen.name_size).value.sp
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(dimensionResource(R.dimen.card_corner)))
            .background(backgroundColor)
            .padding(dimensionResource(R.dimen.card_padding)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = dimensionResource(R.dimen.card_padding)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.text_gap))
        ) {
            Text(
                text = name,
                color = nameColor,
                fontSize = nameFontSize,
                fontWeight = nameFontWeight,
                fontFamily = nameFontFamily
            )
            Text(
                text = address,
                color = addressColor,
                fontSize = dimensionResource(R.dimen.detail_size).value.sp
            )
        }
    }
}