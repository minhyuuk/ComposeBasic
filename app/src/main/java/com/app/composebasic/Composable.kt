package com.app.composebasic

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

// Compose는 Composable을 기반으로 합니다.
// Composable은 아무데나 저장이 가능합니다.
// 동일한 패키지 내에만 있으면 아무 곳에서 작동합니다.
// Modifier는 속성 제공함
@Composable
fun GreetingText(name: String) {
    Surface(color = MaterialTheme.colors.secondaryVariant) {
        Text(
            text = "Hello $name!",
            modifier = Modifier
                .width(200.dp)
                .height(240.dp)
                .clickable { }
                .padding(all = 24.dp),
//          Compose는 재료 테마 사용을 권장한다.
//          지금 보는 것처럼 이미 정적 클래스에 크기 또는 속성이 정의되어 있다.
//          Jetpack Compose는 정적 Content 및 값을 제공한다.
//          사전 정의된 값으로 더 간단하게 UI 구성이 가능하다.
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
fun MainScreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            HorizontalColoredBar(color = Color.Magenta)
            HorizontalColoredBar(color = Color.Gray)
            HorizontalColoredBar(color = Color.Blue)
        }
    }
}

@Composable
fun HorizontalColoredBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .height(600.dp)
            .width(60.dp)
    ) { }
}

@Composable
fun GreetingButton() {
    Button(onClick = {}) {
        GreetingText(name = "button")
    }
}
