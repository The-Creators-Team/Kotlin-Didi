package com.example.kotlinlearning.challenges

fun main (args: Array<String>){
    println("1st Card")
    println(validate("1121-0000-0000-0312","03/12"))
    println("2nd Card")
    println(validate("1234-5678-9101-1121","11/21"))
    println("3rd Card")
    println(validate("1121-0000-000-0312","03/12"))
    println("4th Card")
    println(validate("1121-0000-0000-0312","04/12"))
    println("5th Card")
    println(validate("1121-0000-ABCD-0312","03/12"))
}

fun validate (cardNumber: String, expiryDate: String): Boolean {
    val validation: Boolean

    if(cardNumber.length != 19) {
        validation = false
    } else if (!(cardNumber[0].isDigit() && cardNumber[1].isDigit() && cardNumber[2].isDigit() && cardNumber[3].isDigit()
                && cardNumber[5].isDigit() && cardNumber[6].isDigit() && cardNumber[7].isDigit() && cardNumber[8].isDigit()
                && cardNumber[10].isDigit() && cardNumber[11].isDigit() && cardNumber[12].isDigit()
                && cardNumber[13].isDigit() && cardNumber[15].isDigit() && cardNumber[16].isDigit() && cardNumber[17].isDigit()
                && cardNumber[18].isDigit())){
        validation = false
    } else if (!((cardNumber.substring(15,17) == expiryDate.substring(0,2)) && (cardNumber.substring(17,19) == expiryDate.substring(3,5)))){
        validation = false
    } else if (!(cardNumber.substring(0,4) == "1121" || cardNumber.substring(0,4) == "1111" || cardNumber.substring(0,4) == "3796")){
        validation = false
    } else {
        validation = true
    }

    return validation
}