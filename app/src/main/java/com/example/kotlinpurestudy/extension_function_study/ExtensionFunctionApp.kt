package com.example.kotlinpurestudy.extension_function_study

fun main(){

    println(67.isEven())
    println("Hello World".addExclamation())

    println("Hello".containsVowels())
    println("Dinosaur".getVowels())

}

fun Int.isEven():Boolean{
    return this % 2 == 0
}

fun String.addExclamation():String {
    return "$this!"
}

fun String.containsVowels():Boolean{
    val vowels = listOf('a', 'e', 'i','o', 'u', 'y')
    val vowelsInTheWord = mutableListOf<Char>()
    var areThereVowels = false
    for(x in vowels){
        if(this.contains(x)){
           areThereVowels = true
            vowelsInTheWord.add(x)
        }
    }
    //print("Vowels in the given word: $vowelsInTheWord")
    return areThereVowels
}

fun String.getVowels():List<Char>{
    val vowels = listOf('a', 'e', 'i','o', 'u', 'y')
    val vowelsInTheWord = mutableListOf<Char>()
    for(x in vowels){
        if(this.contains(x)){
            vowelsInTheWord.add(x)
        }
    }
    return vowelsInTheWord
}