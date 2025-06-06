package com.example.multiplicationtable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multiplicationtable.ui.theme.MultiplicationTableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimesTable()
        }
    }
}

@Preview
@Composable
fun TimesTable() {
    Column(
        modifier = Modifier
            .fillMaxSize()


    ) {
        for (i in 1 until 10) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                var color : Color
                for (j in 1 until 10) {
                    if ((i + j) % 2 == 0) {
                         color = Color.Yellow
                    } else {
                         color = Color.White
                    }
                    Box(
                        modifier = Modifier
                            .background(color = color)
                            .fillMaxHeight()
                            .weight(1f)
                            .border(width = 1.dp, color = Color.DarkGray),
                        Alignment.Center
                    ) {
                        Text(text = "${i * j}")
                    }
                }
            }


        }
    }
}




