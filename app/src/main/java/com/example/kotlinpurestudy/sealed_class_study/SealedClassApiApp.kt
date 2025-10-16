package com.example.kotlinpurestudy.sealed_class_study

fun main(){
    when(val response = fetchUserData()){
        is ApiResponse.Success -> println("Data: ${response.data}")
        is ApiResponse.Error -> println("Error: ${response.message}")
        ApiResponse.Loading -> println("Loading")
    }
}

fun fetchUserData():ApiResponse<String> {
    // this response can be Success,Error or Loading
    return ApiResponse.Success("User:Alice")
}

sealed class ApiResponse<out T>{
    class Success<out T>(val data:T):ApiResponse<T>()
    class Error (val message: String): ApiResponse<Nothing>()
    object Loading: ApiResponse<Nothing>()
}