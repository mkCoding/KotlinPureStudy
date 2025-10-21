package com.example.kotlinpurestudy.inline_function_study

fun main(){
    val num1 = 5
    val num2 = 10

    // function code is being passed here
    val sum = runOperation {
        num1 + num2
    }

    println(sum) // return sum
}

/*
inline function
- replace function call with function code
 */
inline fun runOperation(block: () -> Int): Int {
    return block()
}


