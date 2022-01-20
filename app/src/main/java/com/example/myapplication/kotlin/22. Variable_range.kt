package com.example.myapplication.kotlin

// 변수의 접근 범위
// 1. 전역 변수
// 2. 지역 변수

var number100: Int = 100

fun main(array: Array<String>) {
    println(number100)

    val test = Test("홍길동")
    test.testFun()
    println(test.name)
    println(number100)
}

class Test(var name: String) {
    fun testFun() {
        var birth: String = "2000/3/1"
        name = "홍길동"
        number100 = 200
    }

}