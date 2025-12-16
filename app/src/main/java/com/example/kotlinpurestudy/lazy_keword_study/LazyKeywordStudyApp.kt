package com.example.kotlinpurestudy.lazy_keword_study

fun main(){

    // Lazy - calculate a value on first access

    /*
    this will ensure dog object instance is not created until its actually needed
     */
    val dog by lazy {Dog()}

    val shouldBark = true // could be true or false

    if (shouldBark){
        dog.bark()
    }else{
        // do nothing
    }

    /*
    summary if we didn't use lazy above the Dog instance will be created whether
    should bark is true or not
     */
}

class Dog {
    fun bark(){
        println("Dog is barking")
    }
}