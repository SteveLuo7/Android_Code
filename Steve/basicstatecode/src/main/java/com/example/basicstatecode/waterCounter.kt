package com.example.basicstatecode

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable

fun StatefulCounter(modifier: Modifier = Modifier) {

    var count by rememberSaveable{ mutableStateOf(0)}

    StatelessCounter(count = count, onIncrement = {count++}, modifier = modifier)

}

@Composable
private fun StatelessCounter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    var count = count
    Column(modifier = modifier.padding(16.dp)) {

        if (count > 0) {
            Text(text = "You've had ${count} glasses.")
        }

        Button(
            onClick = { count++ },
            Modifier.padding(top = 8.dp),
            enabled = count < 10
        ) {

            Text(text = "Add One")
        }

        Button(
            onClick = { count-- },
            Modifier.padding(top = 8.dp),
            enabled = count   > 0
        ) {

            Text(text = "Minus One")
        }
    }
}