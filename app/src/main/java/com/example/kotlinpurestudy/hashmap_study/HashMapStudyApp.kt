package com.example.kotlinpurestudy.hashmap_study

fun main(){

    val tvSettings = hashMapOf(
        "volume" to 30,
        "brightness" to 75,
        "contrast" to 20,
        "sharpness" to 55,
        "inputSource" to "HDMI 1",
        "wifiConnected" to true,
        "language" to "English",
        "pictureMode" to "Cinema",
        "powerSaving" to false
    )


    // Add a new setting
    tvSettings["bluetoothEnabled"] = true

     //print all settings
    for((settings, value) in tvSettings){
    println("$settings:  $value")
    }


}