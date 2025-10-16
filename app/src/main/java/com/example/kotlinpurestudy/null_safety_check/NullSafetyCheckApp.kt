package com.example.kotlinpurestudy.null_safety_check

fun main(){
   /*
    4 null safety checks
    - safe call
    - elvis operator
    - double bang
    - safe call
    */

    // Safe call
    val person = Person(
        name = "John Smith",
        age = 40,
        hairColor = "Black",
        height = "6 foot 7 inches"
    )

    println(person?.age)

    // Elvis Operator
    val person2 = Person(
        name = "John Smith",
        age = 40,
        hairColor = null,
        height = "6 foot 7 inches"
    )

    val result = person2.hairColor?:"No hair Color"
    println(result)

    // Double Bang operator
    val person3 = Person(
        name = null,
        age = 40,
        hairColor = null,
        height = null
    )

    val result2 = person3?.height?:"No height found"
    println(result2)

    // Safe Cast
  val myContent:Any = "hello world"

    val castAgeToString = myContent as String
    println("This is age cast as a string $castAgeToString")
}

class Person(
    private val name:String? = null,
    val age:Int? = null,
    val hairColor:String?=null,
    val height:String?= null
){
    fun talk(){
        println("$name is talking")
    }

}