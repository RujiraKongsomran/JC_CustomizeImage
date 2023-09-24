package com.rujirakongsomran.jc_customizeimage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rujirakongsomran.jc_customizeimage.ui.theme.JC_CustomizeImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_CustomizeImageTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}


@Composable
fun MyApp() {
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            CreateCircleShape()
            CreateRoundedCornerShape()
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            CreateSquashedOval()
            CreateBorderImage()

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            CreateRainBowColorBrush()
            CreateBlendMode()

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyAppPreview() {
    JC_CustomizeImageTheme {
        MyApp()
    }
}


