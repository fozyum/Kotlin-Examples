package com.example.mykotlinapp
//super class, parent class, base class

fun main(){

    val numbers = arrayListOf<Double>()

    numbers.add(13.5)
    numbers.add(15.6)
    numbers.add(15.6)
    numbers.add(15.6)
    numbers.add(15.6)

    var total: Double = 0.0
    for (i in numbers)
    {
        total += i
    }
    //akjsdhkasjd
    //kajdhksajhdkja

    /*val numbers= arrayOf(1,2,3,4,5,6)

    //print(numbers.contentToString())

    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    
    val days = arrayOf("Sun","Mon","Tues","Wed","Thurs","Fri","Sat")
    

    val fruits = arrayOf(Fruit("Apple",2.5))
    val months = listOf("jan").toMutableList()
    months.addAll(days)
    print(months)*/
}

data class Fruit(val name: String, val price:Double)









/*open class Car(val name: String, val brand: String){
    var range: Double =0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    fun drive(distance: Double){
        println("Drove fo $distance KM")
    }
}

class ElectricCar(name: String, brand: String, batteryLife: Double)
    : Car(name,brand){

}

fun main(){
    var myCar = Car("A3","Audi")
    var myECar = ElectricCar("s-Model","tesla,85.0")

    myCar.drive(200.0)
    myECar.drive(200.0)
}*/









/*class MobilePhone(osName: String,brand: String,model: String){

   private var battery : Int = 30

    init{
        println("The phone $model from $brand uses $osName as its Operating system")
    }

    fun chargeBattery(chargedBy: Int)
    {}
}

fun main(){

}*/










/*
fun main()
{
    var myCar = Car()
    println("brand is ${myCar.brand}")
    println("Maxspeed is ${myCar.maxSpeed}")
}

class Car ()
{
   lateinit var owner : String
   val brand :String = "BMW"

    get(){
        return field.toLowerCase()
    }

    var maxSpeed: Int = 250
    //get() = field
    set(value){
        field = if(value>0)value else throw IllegalArgumentException("Max speed can not lower than 0")
    }

   init {
       this.owner = "Frank"
   }
}*/
