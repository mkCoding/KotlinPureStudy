package com.example.kotlinpurestudy.interview_study

class CodingInterviewQuestion3 {
    /*
Write an algorithm that will identify valid IPv4
addresses in dot-decimal format. IPs should be considered valid if they
consist of four octets, with values between 0 and 255, inclusive.
 */

    fun main() {
        println(isIPValid("0.0.0"))
    }

    fun isIPValid(ip:String): Boolean{

        // dot-decimal format check
        val parts = ip.split(".")
        if(parts.size!=4) return false // must be 4 quadrants

        for(p in parts){
            // must be a number
            var num = p.toIntOrNull()?: return false

            // values between 0 - 255 inclusive
            if(num !in 0..255) return false

            // no leading zeros
            if(p!= num.toString()) return false
        }
        return true
    }
}