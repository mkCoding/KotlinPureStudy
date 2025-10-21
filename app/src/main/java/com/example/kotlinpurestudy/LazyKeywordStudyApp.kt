package com.example.kotlinpurestudy

fun main(){

    val executeBark by lazy {
        {
            val dog = Dog()
            dog.bark()
        }
    }

    val shouldDogBark = true

    if(shouldDogBark){
        executeBark()
    }else{
        // do nothing
    }

}

class Dog {
    fun bark(){
        println("Dog is barking")
    }
}