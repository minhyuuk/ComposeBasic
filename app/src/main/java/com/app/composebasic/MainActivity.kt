package com.app.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.app.composebasic.ui.theme.ComposeBasicTheme

class MainActivity : ComponentActivity() {
    // ComposeBasic은 프로젝트 명이며 프로젝트 명 + Theme이라는 이름으로 생성된다.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnScreen()
        }
    }
}

// Amulator를 실행하기 전에 Split 또는 Design을 통해
// 미리 실행화면을 볼 수 있는 함수이다.
// DefaultPreview()는 테스트 코드같은 느낌이다.
// 이를 삭제하면 코드나 디자인 보기 유형이 제거된다.

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBasicTheme {
        ColumnScreen()
    }
}
