package com.example.as1_yuanrui_gao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.as1_yuanrui_gao.ui.theme.As1_Yuanrui_GaoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            As1_Yuanrui_GaoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Henry",
                        modifier = Modifier.padding(innerPadding)
                    )
                    ColumnList()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        text = "Hello $name!",
    )
}

@Preview(showBackground = true)
@Composable
fun ColumnList() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        items(1){
            Greeting(
                name = "Henry"
            )
        }
        imageView.setImageResource(R.drawable.page1)
        items(1) {
            Text(
                modifier = Modifier
                   .padding(0.dp),
                text = "Item number $it",
            )

        }
    }
}
