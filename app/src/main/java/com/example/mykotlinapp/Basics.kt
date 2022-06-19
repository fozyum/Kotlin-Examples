package com.example.mykotlinapp

fun main(){
    ifstatement()

}

fun ifstatement(){
    var height1 = 170
    var height2 = 180

    if(height1<height2)
    {
        println("use raw force")
    }
    else if (height1 == height2)
    {
        println("use your power technique")
    }
    else
    {
        println("use technique")
    }

    var season = 5
    when(season)
    {
        1 -> println("fall")
        2 -> println("summer")
        3 -> {
            println("fall")
            println("autumn")
        }
        in 4..8 -> println("wow")
        else -> println("wrong ")
    }

    for(num in 1..10)
    {
        println("$num")
    }
    for(i in 1 until 10)
    {
        println("$i")
    }
    for(a in 10 downTo 2 step 2)
    {
        println("$a")
    }

    var humidity = "humid"
    var humidityLevel = 80

    while (humidity == "humid" )
    {
        humidityLevel -= 5
        println("humidity decreased")
        if(humidityLevel < 60)
        {
            println("it is comfy now")
            humidity = "comfy"
        }
    }


}