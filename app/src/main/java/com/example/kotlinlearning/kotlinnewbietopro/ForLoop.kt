package com.example.kotlinlearning.kotlinnewbietopro

fun main(){
    val myArray = arrayOf(5.0,4.0,2.0,7.0)
    var sum = 0.0

    for(item in myArray){
        sum += item
    }

    println(sum)
    println(sum/myArray.size)
}