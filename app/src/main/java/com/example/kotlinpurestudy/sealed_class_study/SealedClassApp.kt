package com.example.kotlinpurestudy.sealed_class_study

fun main(){
    var gamingState = GameState.Paused
    printGamingState(gamingState)
}

fun printGamingState(gameState: GameState){
    when(gameState){
        is GameState.Starting -> println("Game Starting")
        is GameState.Playing -> println("Game is Playing")
        is GameState.Paused -> println("Game is Paused")
        GameState.GameOver -> println("Game is over")
    }
}

/*
Sealed class restricts inheritance to a specific set of subclasses
Used to represent different states
 */
sealed class GameState{
    object Starting: GameState()
    object Playing: GameState()
    object Paused: GameState()
    object GameOver: GameState()
}