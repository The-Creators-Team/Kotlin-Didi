package com.example.kotlinlearning.challenges

fun main(args: Array<String>){
    println("Enter purchase price and amount of cash separated by ;")
    var values = readLine()
    var purchasePrice: Double
    var purchasePriceString = ""
    var cashProvidedPos = 0
    var cashProvided: Double
    var cashProvidedString = ""
    var change: Double
    var result = ""
    var resultFinal = ""

    if(values != null) {
        for(i in values) {
            if(i == ';') {
                cashProvidedPos++
                break
            }
            else {
                purchasePriceString += i
                cashProvidedPos++
            }
        }
    }
    purchasePrice = purchasePriceString.toDouble()

    if(values != null){
        for(i in cashProvidedPos until values.length - 1){
            cashProvidedString += values[i]
        }
    }
    cashProvided = cashProvidedString.toDouble()

    while(values != null) {
        if (cashProvided < purchasePrice) {
            println("ERROR")
            break
        } else if (cashProvided == purchasePrice) {
            println("ZERO")
            break
        } else {
            change = cashProvided - purchasePrice

            while (change != 0.0) {
                if (change / 100.0 >= 1) {
                    if ((change / 100.0).toInt() > 1) {
                        result += (change / 100.0).toInt().toString()
                        result += " ONE HUNDRED,"
                        change -= 100.0
                    } else {
                        result += "ONE HUNDRED,"
                        change -= 100.0
                    }
                } else if (change / 50.0 >= 1) {
                    if ((change / 50.0).toInt() > 1) {
                        result += (change / 50.0).toInt().toString()
                        result += " FIFTY,"
                        change -= 50.0
                    } else {
                        result += "FIFTY,"
                        change -= 50.0
                    }
                } else if (change / 20.0 >= 1) {
                    if ((change / 20).toInt() > 1) {
                        result += (change / 20).toInt().toString()
                        result += " TWENTY,"
                        change -= 20
                    } else {
                        result += "TWENTY,"
                        change -= 20
                    }
                } else if (change / 10.0 >= 1) {
                    if ((change / 10.0).toInt() > 1) {
                        result += (change / 10.0).toInt().toString()
                        result += " TEN,"
                        change -= 10
                    } else {
                        result += "TEN,"
                        change -= 10
                    }
                } else if (change / 5.0 >= 1) {
                    if ((change / 5).toInt() > 1) {
                        result += (change / 5).toInt().toString()
                        result += " FIVE,"
                        change -= 5
                    } else {
                        result += "FIVE,"
                        change -= 5
                    }
                } else if (change / 2.0 >= 1) {
                    if ((change / 2).toInt() > 1) {
                        result += (change / 2).toInt().toString()
                        result += " TWO,"
                        change -= 2
                    } else {
                        result += "TWO,"
                        change -= 2
                    }
                } else if (change / 1.0 >= 1) {
                    if ((change / 1).toInt() > 1) {
                        result += (change / 1.0).toInt().toString()
                        result += " ONE,"
                        change -= 1
                    } else {
                        result += "ONE,"
                        change -= 1
                    }
                } else if (change / 0.5 >= 1) {
                    if ((change / 0.5).toInt() > 1) {
                        result += (change / 0.5).toInt().toString()
                        result += " HALF DOLLAR,"
                        change -= 0.5
                    } else {
                        result += "HALF DOLLAR,"
                        change -= 0.5
                    }
                } else if (change / 0.25 >= 1) {
                    if ((change / 0.25).toInt() > 1) {
                        result += (change / 0.25).toInt().toString()
                        result += " QUARTER,"
                        change -= 0.25
                    } else {
                        result += "QUARTER,"
                        change -= 0.25
                    }
                } else if (change / 0.1 >= 1) {
                    if ((change / 0.1).toInt() > 1) {
                        result += (change / 0.1).toInt().toString()
                        result += " DIME,"
                        change -= 0.1
                    } else {
                        result += "DIME,"
                        change -= 0.1
                    }
                } else if (change / 0.05 >= 1) {
                    if ((change / 0.05).toInt() > 1) {
                        result += (change / 0.05).toInt().toString()
                        result += " NICKEL,"
                        change -= 0.05
                    } else {
                        result += "NICKEL,"
                        change -= 0.05
                    }
                } else if (change / 0.01 >= 1) {
                    if ((change / 0.01).toInt() > 1) {
                        result += (change / 0.01).toInt().toString()
                        result += " PENNY,"
                        change -= 0.01
                    } else {
                        result += "PENNY,"
                        change -= 0.01
                    }
                }
            }

            for (i in 0 until result.length - 1) {
                resultFinal += result[i]
            }
            println(resultFinal)
            break
        }
    }
}

