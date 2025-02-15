package com.example.as1_yuanrui_gao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.as1_yuanrui_gao.ui.theme.As1_Yuanrui_GaoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            As1_Yuanrui_GaoTheme {
                Scaffold(
                    topBar = {
                        TopAppBarDemo("Henry")
                    },
                    content = { paddingValues ->
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(paddingValues)
                                .background(Color.Gray.copy(alpha = 0.1f)),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            ColumnList()
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun TopAppBarDemo(name: String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        text = "Hello $name!",
    )
}

@Composable
fun ColumnList() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.page1),
                contentDescription = "Page 1 Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                contentScale = ContentScale.Crop
            )
        }
        items(2) {
            Text(
                modifier = Modifier.padding(40.dp),
                text = "Item number $it",
            )
        }
    }
}
