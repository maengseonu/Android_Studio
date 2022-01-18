package com.example.myapplication.kotlin


// 10. 제어흐름

// When

fun main(array: Array<String>) {

    val value: Int = 1

    when (value) {
        1 -> println("Value is 1")
        2 -> println("Value is 2")
        3 -> println("Value is 3")
        else -> println("I do not know value")
    }

    if (value == 1) {
        println("Value is 1")
    } else if (value == 2) {
        println("Value is 2")
    } else if (value == 3) {
        println("Value is 3")
    } else {
        println("I do not know value")
    }

    val value2 = when(value){
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)
}