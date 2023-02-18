package com.example.wellfed

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wellfed.ui.theme.WellFedTheme
import kotlin.math.round

@Composable
fun Login() {
    Box(modifier = Modifier
        .background(Color.Magenta)
        .fillMaxSize()
        .padding(start = 60.dp, end = 60.dp, top = 60.dp, bottom = 60.dp),
        contentAlignment = Alignment.Center
    ) {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp, end = 15.dp)
            ) {

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(30.dp))
                            .background(Color.Blue)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                        ) {
                            Text(text = "I love Android")
                            Text(text = "This is fun")
                            Text(text = "This is fun")
                            Text(text = "This is fun")
                            Text(text = "This is fun")
                            Text(text = "This is fun")
                            Text(text = "This is fun")

                        }
                    }

            }


    }
}

@Preview(showBackground = true)
@Composable
fun DefaulPreview() {
    WellFedTheme {
        Login()
    }
}