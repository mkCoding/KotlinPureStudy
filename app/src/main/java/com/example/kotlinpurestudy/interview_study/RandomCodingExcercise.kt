package com.example.kotlinpurestudy.interview_study


fun main(){
    reversedWord("dinosaur")
    isPalindrone("moon")
    firstNonRepeatingChar("leetcode")
    countVowelsInString("computer")
    factorial(5)
    sumOfListElements(listOf(1,2,3))
    findLargestElementInArray(arrayListOf(3,488,4,67,90,9))
    isPrime(2)
}

fun isPrime(number:Int): Boolean{
    // number that can only be divided by 1 and itself
    val divisibleNumbers = mutableListOf<Int>()
    val allowedNumbers = setOf(1, number)

    for (x in number downTo 1){
        if(number % x == 0){
            // add to divisableNumbers list
            divisibleNumbers.add(x)
        }
    }

    val isPrime = divisibleNumbers.all { it in allowedNumbers }
    println("$divisibleNumbers - $isPrime")
    return isPrime
}


fun findLargestElementInArray(list: ArrayList<Int>):Int{
    var largestElement = 0

    for(x in list){
        if(x > largestElement){
            largestElement = x
        }
    }
    println(largestElement)
    return largestElement

}
fun sumOfListElements(list:List<Int>):Int{
    var sum = 0
    for(x in list){
        sum += x
    }
    println(sum)
    return sum
}

fun factorial(number:Int): Int{
    var factorialResult = 1
    for (x in number downTo 1) {
        factorialResult *= x
    }

    println(factorialResult)
    return factorialResult
}

fun countVowelsInString(word:String):Int{
    val vowelsList = listOf('a', 'e', 'i', 'o', 'u', 'y')
    val vowelsFound = mutableListOf<Char>()
    var vowelCount = 0

    for(ch in vowelsList){
        if(word.contains(ch)){
            vowelsFound.add(ch)
            vowelCount +=1
        }
    }
    println("$vowelCount - $vowelsFound")
    return vowelCount
}

fun firstNonRepeatingChar(word:String):Char{

    val wordCharArray = word.toCharArray()
    var firstNonRepeatCh = ' '

    for(ch in wordCharArray){
        // count char in array and determine if it shows up only 1 time
        if(word.count { ch == it } == 1){
            firstNonRepeatCh = ch
            break // dont go to any other char found later in word
        }
    }
    println(firstNonRepeatCh)
    return firstNonRepeatCh
}
fun isPalindrone(word: String):Boolean {
    var reversedWord = ""
    var isPalindrone = false

    for(ch in word.reversed()){
        reversedWord += ch
    }

    if(reversedWord==word){
        isPalindrone = true
    }
    println(isPalindrone)
    return isPalindrone
}

fun reversedWord(word:String) {
    var reversedWord = ""

    for (char in word.reversed()) {
        reversedWord += char
    }

    println(reversedWord)
}