package com.example.kotlinpurestudy.loop_study

fun main(){

    val myList = arrayListOf("dog", "cat", "dinosaur","bird", "bear", "lion")


    // print every element
    print("Every element-> ")
    for(element in myList){
        print("$element, ")
    }

    // print every other element in list
    print("\nEvery other element-> ")
   for(i in myList.indices step 2){
       print("${myList[i]}, ")
   }

    print("\n1st and last element -> ")
    print("${myList[0]}, ${myList.last()}")


    print("\nAll numbers 1 - 10: ")
    // Print numbers 1 - 10 using loop
    for(i in 1..10){
        print("$i, ")
    }

    print("\nPrint only even numbers: ")
    val numbers = arrayOf(1,2,33,31, 66, 99, 100)
    for(num in numbers){
        if(num % 2 == 0){
            print("$num, ") // will print only even
        }
    }

    print("\nPrint only odd numbers: ")
    for (num in numbers){
        if(num % 2 != 0){
            print("$num, ") // will print only odd numbers
        }
    }

    print("\nPrint sum of numbers in a list: ")
    val numbers2 = arrayOf(44, 55,89,3000,49,98,777)
    var sum = 0
    for(num2 in numbers2){
       sum+=num2
    }

    print("$sum")


}

