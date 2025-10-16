package com.example.kotlinpurestudy.inheritance_study

fun main(){

    val dog = Dog()
    dog.eat() // inherited from Animal Class
    dog.sleep() // inherited from Animal Class
    dog.move() // inherited from Animal Class
    dog.bark()
    dog.howl()
    dog.wagTail()

    println(dog.color)
}


open class Animal(){
    val color:String = "Brown" // just adding this to show inheritance of properties

    fun eat(){}
    fun sleep(){}
    fun move(){}
}

class Dog: Animal() {
    // Dog inherits from Animal
    fun bark(){
        println("Dog is barking")
    }

    fun wagTail(){
        println("Dog tail is wagging")
    }

    fun howl(){
        println("Dog is howling")
    }

}