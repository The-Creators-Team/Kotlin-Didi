package com.example.kotlinlearning.challenges

import java.util.Arrays

fun convertArrays(arr1: IntArray, arr2: IntArray): IntArray{
    val output = mutableListOf<Int>()

    for(i in arr1){
        if(i in output) continue
        else {
          output.add(i)
        }
    }

    for(i in arr2){
        if(i in output) continue
        else {
            output.add(i)
        }
    }
    output.sort()
    return output.toIntArray()
}

fun main(args: Array<String>){
    println(Arrays.toString(convertArrays(intArrayOf(4, 5, 9, 1, 4, 3, 6, 8, 9), intArrayOf(7, 2, 5, 8, 3, 1, 4, 7, 2))))
    println(Arrays.toString(convertArrays(intArrayOf(10, 15, 10), intArrayOf(15, 20))))
    println(Arrays.toString(convertArrays(intArrayOf(), intArrayOf(1, 2, 3))))
    println(Arrays.toString(convertArrays(intArrayOf(2, 2, 2), intArrayOf(2, 2, 2))))
}