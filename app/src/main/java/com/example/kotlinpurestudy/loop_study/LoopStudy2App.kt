package com.example.kotlinpurestudy.loop_study

fun main(){
    val numbers = listOf(1,2,3,4,5,6,100, 3000)
    val reversedList = mutableListOf<Int>()

    // Reverse list
    print("\nReversed List: ")
    for(i in numbers.indices.reversed()){
        reversedList.add(numbers[i])
    }
    println(reversedList)

    // Count vowels in a string
    val text = "Android"
    var numberOfVowels = 0
    val vowels = listOf('a', 'e', 'i', 'o', 'u')

    for(i in text.indices){
        if(text.lowercase()[i] in vowels){
            numberOfVowels +=1
        }
    }
    print("Number of vowels in $text is $numberOfVowels")

    //Multiply all elements in list
    print("\nProduct of numbers in list: ")
    val numbersToCalculate = listOf(3,6,7)
    var product = 1
    for (num in numbersToCalculate){
        product *= num
    }
    print(product)
}