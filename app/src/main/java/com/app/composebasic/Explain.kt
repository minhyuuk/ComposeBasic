package com.app.composebasic

// 이 파일은 내가 알게 되었던 내용을 정리하는 파일이다.

// Composable 의 생명주기
// Android 전통적인 생명주기보다 적은 3개의 상태가 존재.
    // Initial Composition - Composable이 처음 생성될 때
    // Recomposition - UI를 구성하는 데이터가 변경되었을 때 (주로 State<T>가 바뀌거나 Composable 함수의 매개변수의 값이 변화할 때 실행된다)
    // Decomposition - Composable이 파괴될 때