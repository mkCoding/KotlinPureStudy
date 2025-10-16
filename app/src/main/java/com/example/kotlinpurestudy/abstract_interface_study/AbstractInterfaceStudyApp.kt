package com.example.kotlinpurestudy.abstract_interface_study

fun main(){

    val cleaningRobot = CleaningRobot(500)
    cleaningRobot.start()
    cleaningRobot.recharge()
    cleaningRobot.performAction()
    cleaningRobot.stop()
    cleaningRobot.recharge()

}


interface Robot{
    // holds blueprint of methods to be implemented
    fun start()
    fun stop()
    fun recharge()
    fun performAction()
}

// for any class of type robot inherit from Robot and implement methods
class CleaningRobot(
    private val robotId:Int
): Robot {
    override fun start() {
       println("Cleaning robot $robotId is starting")
    }

    override fun stop() {
        println("Cleaning robot $robotId is stopping")
    }

    override fun recharge() {
        println("Cleaning robot $robotId is recharging now")
    }

    override fun performAction() {
        println("Cleaning robot $robotId is cleaning the floor")
    }


}

class CookingRobot(
    private val robotId:Int
):Robot{
    override fun start() {
        println("Cooking Robot $robotId is starting")
    }

    override fun stop() {
        println("Cooking Robot $robotId is stopping ")
    }

    override fun recharge() {
        println("Cooking Robot $robotId is recharging now")
    }

    override fun performAction() {
        println("Cooking Robot $robotId is cooking a steak now")
    }

}

class MedicalRobot(
    val robotId: Int
):Robot{
    override fun start() {
        println("Medical Robot $robotId is starting")
    }

    override fun stop() {
        println("Medical Robot $robotId is stopping")
    }

    override fun recharge() {
        println("Medical Robot $robotId is recharging")
    }

    override fun performAction() {
        println("Medical Robot $robotId is performing a surgery")
    }

}