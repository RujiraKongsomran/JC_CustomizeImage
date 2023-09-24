package com.rujirakongsomran.jc_customizeimage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CreateCircleShape() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = "dog",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)

        )
        Text(
            "CircleShape",
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun CreateRoundedCornerShape() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = "dog",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .clip(RoundedCornerShape(16.dp))

        )
        Text(
            "RoundedCornerShape",
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun CreateSquashedOval() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = "dog",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .clip(SquashedOval())
        )
        Text(
            "SquashedOval",
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun CreateBorderImage() {
    val borderWidth = 4.dp
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = "dog",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .border(
                    BorderStroke(borderWidth, Color.Yellow),
                    CircleShape
                )
                .padding(borderWidth)
                .clip(CircleShape)
        )
        Text(
            "BorderImage",
            fontWeight = FontWeight.Bold
        )
    }

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
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = "dog",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .border(
                    BorderStroke(borderWidth, rainbowColorBrush),
                    CircleShape
                )
                .padding(borderWidth)
                .clip(CircleShape)
        )
        Text(
            "RainBowColorBrush",
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun CreateBlendMode() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = "dog",
            colorFilter = ColorFilter.tint(
                Color.Green,
                blendMode = BlendMode.Darken
            ),
            modifier = Modifier.size(150.dp)
        )
        Text(
            "BlendMode",
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun CreateImageFilterWithColorMatrix() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = "dog",
            colorFilter = ColorFilter.colorMatrix(
                ColorMatrix().apply { setToSaturation(0f) }
            ),
            modifier = Modifier.size(150.dp)
        )
        Text(
            "ImageFilterWithColorMatrix",
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun CreateBlurImage() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = "dog",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .blur(
                    radiusX = 10.dp,
                    radiusY = 10.dp,
                    edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(8.dp))
                )
        )
        Text(
            "BlurImage",
            fontWeight = FontWeight.Bold
        )
    }
}