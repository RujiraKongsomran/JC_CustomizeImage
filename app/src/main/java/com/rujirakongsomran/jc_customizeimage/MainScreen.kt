package com.rujirakongsomran.jc_customizeimage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CreateCircleShape() {
    Image(
        painter = painterResource(id = R.drawable.dog),
        contentDescription = "dog",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(100.dp)
            .clip(CircleShape)

    )
}

@Composable
fun CreateRoundedCornerShape() {
    Image(
        painter = painterResource(id = R.drawable.dog),
        contentDescription = "dog",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(100.dp)
            .clip(RoundedCornerShape(16.dp))

    )
}

@Composable
fun CreateSquashedOval() {
    Image(
        painter = painterResource(id = R.drawable.dog),
        contentDescription = "dog",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(100.dp)
            .clip(SquashedOval())
    )
}

@Composable
fun CreateBorderImage() {
    val borderWidth = 4.dp
    Image(
        painter = painterResource(id = R.drawable.dog),
        contentDescription = "dog",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(100.dp)
            .border(
                BorderStroke(borderWidth, Color.Yellow),
                CircleShape
            )
            .padding(borderWidth)
            .clip(CircleShape)
    )

}

@Composable
fun CreateRainBowColorBrush() {
    val rainbowColorBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xFF9575CD),
                Color(0xFFBA68C8),
                Color(0xFFE57373),
                Color(0xFFFFB74D),
                Color(0xFFFFF176),
                Color(0xFFAED581),
                Color(0xFF4DD0E1),
                Color(0xFF9575CD)
            )
        )
    }
    val borderWidth = 4.dp
    Image(
        painter = painterResource(id = R.drawable.dog),
        contentDescription = "dog",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(100.dp)
            .border(
                BorderStroke(borderWidth, rainbowColorBrush),
                CircleShape
            )
            .padding(borderWidth)
            .clip(CircleShape)
    )
}

@Composable
fun CreateBlendMode() {
    Image(
        painter = painterResource(id = R.drawable.dog),
        contentDescription = "dog",
        colorFilter = ColorFilter.tint(
            Color.Green,
            blendMode = BlendMode.Darken
        ),
        modifier = Modifier.size(100.dp)
    )
}