package com.example.states

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.states.ui.theme.StatesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StatesTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background){
                    TipCalculator()
                }
            }
        }
    }
}

@Preview
@Composable
fun TipCalculator() {
    Column(modifier = Modifier.padding(64.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(text = stringResource(id = R.string.title), fontSize = 24.sp, modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(16.dp))
        EditNumberField()
    }
}

@Composable
fun EditNumberField(){
    var amoutInput by remember {
        mutableStateOf("")
    }

    TextField(value = amoutInput, onValueChange = {amoutInput = it})
    Text(text = amoutInput)
}
