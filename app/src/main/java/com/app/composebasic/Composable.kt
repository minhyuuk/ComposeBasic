package com.app.composebasic

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Compose는 Composable을 기반으로 합니다.
// Composable은 아무데나 저장이 가능합니다.
// 동일한 패키지 내에만 있으면 아무 곳에서 작동합니다.
@Composable
fun GreetingText(name: String) {
    Surface(color = MaterialTheme.colors.primary) {
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
    }
}

@Composable
fun GreetingButton(){
    Button(onClick ={}) {
        GreetingText(name = "button")
    }
}
