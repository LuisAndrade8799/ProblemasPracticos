package org.dsm.problemaspracticos

fun main() {
    /*
    Parte 1
    val firstNumber = 10
    val secondNumber = 5
    println("$firstNumber + $secondNumber = $result")

    Parte 2
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    Define add() function below this line
     */
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")

    val thirdNumber = 8
    val anotherResult = add(firstNumber, secondNumber)
    val anotherResult1 = add(firstNumber, thirdNumber)
    val subtractResult = subtract(firstNumber,secondNumber)
    val subtractResult1 = subtract(firstNumber, thirdNumber)
    println("$firstNumber + $secondNumber = $anotherResult")
    println("$firstNumber + $thirdNumber = $anotherResult1")
    println("$firstNumber - $secondNumber = $subtractResult")
    println("$firstNumber - $thirdNumber = $subtractResult1")
}

fun add(firstNumber: Int, secondNumber: Int): Int{
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int{
    return firstNumber-secondNumber
}