package com.example.kotlinpurestudy.hashmap_study

import java.util.Locale

fun main(){

    val inventory = hashMapOf(
        "100" to Product("Laptop", 800.00, 300),
        "102" to Product("Lamp", 15.00, 20),
        "103" to Product("Carpet", 80.00, 22),
        "104" to Product("Pen", 2.00, 40),
        "105" to Product("Keyboard", 10.00, 50)
    )

    for((inventoryId, product) in inventory){
        val formattedPrice = String.format(Locale.US, "%.2f", product.price)

        println("Id: $inventoryId -> ${product.name} Price: \$${formattedPrice} Quantity: ${product.quantity}" )
    }

}


class Product(
    val name:String,
    val price:Double,
    val quantity :Int,
)