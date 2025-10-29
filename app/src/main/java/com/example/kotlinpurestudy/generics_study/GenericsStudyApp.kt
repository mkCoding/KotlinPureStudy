package com.example.kotlinpurestudy.generics_study

fun main() {
    // call non generic function (only specific type)
    printMyString("this is a string")


    // call generic function (works for multiple types)
    printValue("hello")
    printValue(123)
    printValue(3.4848595)
    printValue(arrayListOf("3", "575676", "900"))

    // call generic function for list of any type
    val myList = listOf("dog", "cat", "salmon")
    val anyTypeList = listOf(12, "building", 1.09, 575867484949857L, "savings")
    first(myList)
    first(anyTypeList)
}


/*
Non Generic function
 */
fun printMyString(s: String) {
    println(s)
}

/*
Generic Function
function that works for various types
 */
fun <T> printValue(genericValue: T) {
    println(genericValue)
}

/*
restrict generic function to only take a list of any variable type
 */

fun <T> first(list: List<T>) {
    println(list[0])
}