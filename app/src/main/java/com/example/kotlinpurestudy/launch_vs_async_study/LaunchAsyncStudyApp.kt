package com.example.kotlinpurestudy.launch_vs_async_study

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{

    println("Start")

    // launch → does some work, no return value
    val job = launch {
        delay(500)
        println("Launch: Doing some work...")
    }

    // async → returns a value
    val deferred = async {
        delay(300)
        10 + 20
    }

    println("Async result: ${deferred.await()}")
    job.join() // Wait for launch to finish

    println("End")


}

