package org.dsm.problemaspracticos

fun main(){
    println("timeSpentToday = 300 y timeSpentYesterday = 250, la funcion muestra un valor "+comparacionDeTiempo(300,250))
    println("timeSpentToday = 300 y timeSpentYesterday = 300, la funcion muestra un valor "+comparacionDeTiempo(300,300))
    println("timeSpentToday = 200 y timeSpentYesterday = 220, la funcion muestra un valor "+comparacionDeTiempo(200,220))
}

fun comparacionDeTiempo(timeSpentToday:Int, timeSpentYesterday:Int): Boolean{
    return timeSpentToday>timeSpentYesterday
}