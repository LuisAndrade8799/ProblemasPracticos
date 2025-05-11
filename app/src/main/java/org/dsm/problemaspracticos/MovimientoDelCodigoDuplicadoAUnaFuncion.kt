package org.dsm.problemaspracticos

import android.health.connect.datatypes.units.Temperature

fun main() {
    /*
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()

    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()

    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
     */
    cityInformation("Ankara",27,31,82)

    cityInformation("Tokyo",32,36,10)

    cityInformation("Cape Town",59,64,2)

    cityInformation("Guatemala City",50,55,7)
}

fun cityInformation(city:String, lowTemperature:Int, highTemperature:Int, chanceOfRain:Int){
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}