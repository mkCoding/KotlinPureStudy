package com.example.kotlinpurestudy.lambada_study

fun main() {

// lambada - anonymous function

    // 2 params
    val sum = {a:Int, b:Int -> a * b}
    val result = sum(20,2)
    println(result)

    // 1 param
    val square: (Int) -> Int = { it * it }
    println(square(3))

    // multiply every element in list by 2
    val myList = listOf(1, 2, 3, 4, 5, 6, 7)
    val double = myList.map {it * 2}

    println(double)
}

