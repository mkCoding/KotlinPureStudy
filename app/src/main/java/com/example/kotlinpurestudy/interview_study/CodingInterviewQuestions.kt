package com.example.kotlinpurestudy.interview_study

import kotlin.collections.iterator

fun main() {

    // create the list
    val numbersList = listOf(30, 68, 98, 23, 4000, 3000000, 6, 8)
    printSmallestNumber(numbersList)
    printMaxNum(numbersList)
    reverseString("Money")

    val array = arrayListOf(7, 7, 9, 4, 6, 2, 9, 0, 7, 2)
    getCountOfRepeatedNums(array = array)

}

fun getCountOfRepeatedNums(array: ArrayList<Int>){
    val result = mutableMapOf<Int, Int>()

    for(num in array){
        // how many times we've seen this number so far
        val currentCount = result.getOrDefault(num, 0)

        // increment current count by 1
        val newCount = currentCount + 1
        result[num] = newCount // set the new count with associated element in array
    }

    for((num, count) in result){
        if(count > 1){
            println("$num repeats $count number of times")
        }
    }
}

fun reverseString(string:String){
    // reverse string
    val myString = string.lowercase()
    val myStringCharArray = myString.toCharArray()
    var reversedString = ""

    for(letter in myStringCharArray.reversed()){
        reversedString += letter
    }

    println(reversedString)
}

fun printSmallestNumber(numbersList: List<Int>){

  // variable to hold smallest number
    var smallestNumber = numbersList[0]

    for(currentNum in numbersList){
        if(currentNum < smallestNumber){
            smallestNumber = currentNum
        }
    }

    println("Smallest: $smallestNumber")
}
fun printMaxNum(numbersList: List<Int>) {
    // variable holding max number
    var maxNumber = 0 // default value

    // iterate thorough each number in list
    for (currentNum in numbersList) {
        if (maxNumber < currentNum) {
            maxNumber = currentNum // assign the higher number based on current elements in the list
        }
    }

    println("Max: $maxNumber")
}