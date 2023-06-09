package eu.danielschmidt.jitpacktest.investing

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import eu.danielschmidt.jitpack.common.getSharedText

@Composable
fun InvestingHome() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = android.R.color.holo_purple))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Investing Home v0.13 + ${getSharedText()}",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}