package com.example.kotlinpurestudy.enum_study

fun main(){
    move(Directions.NORTH)
}

fun move(directions: Directions){
    when(directions){
        Directions.NORTH -> println("moving north")
        Directions.SOUTH -> println("moving south")
        Directions.EAST -> println("moving east")
        Directions.WEST -> println("moving west")
    }

}

// enum - special class that represents a fixes set of constants
enum class Directions{
    NORTH,
    SOUTH,
    EAST,
    WEST
}