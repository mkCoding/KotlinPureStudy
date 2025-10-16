package com.example.kotlinpurestudy.sealed_class_study

fun main(){
    val paymentMethod = PaymentMethod.PayPal("user@example.com")
    processPayment(paymentMethod)
}

fun processPayment(paymentMethod: PaymentMethod){
    when(paymentMethod){
        is PaymentMethod.CreditCard -> println("Paying via CreditCard")
        is PaymentMethod.PayPal -> println("Paying via PayPal")
        PaymentMethod.Cash -> println("Paying via Cash Payment")
    }
}

sealed class PaymentMethod{
    data class CreditCard (val cardNumber:String, val cvv:Int):PaymentMethod()
    data class PayPal (val email:String): PaymentMethod()
    data object Cash:PaymentMethod()
}
