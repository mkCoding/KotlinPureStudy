package com.example.kotlinpurestudy.interview_study

fun main() {
    var answer = solution(10)
    println(answer)
}

fun solution(number: Int): Int {
    val multiplesHolder = mutableListOf<Int>()

    if(number < 0) return 0

    var sumOfMultiplesBelowGivenNumber = 0
    // get all multiples of the numbers below
    for(num in 1 until number){
        if(num % 3 == 0 || num % 5 == 0){
            sumOfMultiplesBelowGivenNumber+=num
        }
    }

    return sumOfMultiplesBelowGivenNumber

}