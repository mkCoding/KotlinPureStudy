package com.example.kotlinpurestudy.interview_study

fun main(){
    val word = "leetcode"
    val wordCharArray = word.toCharArray()

    for(ch in wordCharArray){
        // if number of times current char appears in string is once
        if(word.count { it == ch} == 1){
            // print char
            println(ch)
            //break the loop since we're looking for 1st one
            break
        }
    }

}
