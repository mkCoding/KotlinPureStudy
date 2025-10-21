package com.example.kotlinpurestudy.companion_object_study

fun main(){
    // calling entities in companion object
    println(CashRegister.BRAND)
    CashRegister.openRegister()
}

class CashRegister{
    fun calculateTotal(){
        println("Printing the total")
    }

    /*
    companion objects
    - singleton
    - prevents necessary instances of same object from being created
    - improves performance since it shares a single instance
     */
    companion object{
        const val BRAND = "CashCompany"
        fun openRegister(){
            println("register open")
        }
    }
}