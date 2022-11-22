fun main(args: Array<String>) {
    //If Else
    /*val number = 1

    println("Number: $number")
    println("1 < 1: ${1 < 1}")*/


    //Ej 1
    /*val isWeatherCold = false

    if (isWeatherCold){
        println("SI deberías llevar abrigo")
    } else{
        println("NO deberías llevar abrigo")
    }*/


    //Ej 2
    /*val age = 30

    if (age == 1){
        println("Saludos, tienes 1 año!")
    } else if (age == 2){
        println("Saludos, tienes 2 años!")
    } else if (age == 3){
        println("Saludos, tienes 3 años!")
    } else if (age == 4){
        println("Saludos, tienes 4 años!")
    } else if (age == 5){
        println("Saludos, tienes 5 años!")
    } else{
        println("Algo raro paso con tu edad")
    }*/


    //Ej 3
    /*val age:Int = 10

    when (age) {
        1 -> println("Saludos, tienes 1 año!")
        2 -> println("Saludos, tienes 2 años!")
        3 -> println("Saludos, tienes 3 años!")
        4 -> println("Saludos, tienes 4 años!")
        5 -> println("Saludos, tienes 5 años!")
        6, 7, 8 -> println("Saludos, tienes entre 6 y 8 años!")
        in 9..15 -> println("Saludos, tienes entre 9 y 15 años!")
        is Int -> println("Saludos, tu edad es un Integer")
        else -> println("Algo raro paso con tu edad")
    }*/


    //Ej 4
    /*val trafficLightColor = "Black"

    val message = if (trafficLightColor == "Red") {
        println("DETENTE")
    } else if (trafficLightColor == "Yellow") {
        println("ATENTO")
    } else if (trafficLightColor == "Green") {
        println("AVANZA")
    } else {
        println("Algo paso con el semáforo")
    }*/


    //Ej 5
    /*val trafficLightColor = "Black"

    when (trafficLightColor) {
        "Red" -> println("DETENTE")
        "Yellow" -> println("ATENTO")
        "Green" -> println("AVANZA")
        else -> println("Algo paso con el semáforo")
    }*/



    //Nullability
    //What is null

    //ej 6
    /*val favoriteActor1 = null
    val favoriteActor2 = "Adam Sandler"
    //println(favoriteActor1)
    //println(favoriteActor2)

    var favoriteActor3: String? = "Adam Sandler"
    //favoriteActor3 = null

    //println(favoriteActor3)
    //println(favoriteActor3?.length)
    println(favoriteActor3!!.length)*/


    //ej 7
    /*val favoriteActor4: String? = null

    val lengthOfName = favoriteActor4?.length ?: 0

    println("El número de caracteres en el nombre de tu actor favorito es: $lengthOfName.")*/




    //CLASES
    //ej 8 (class sin contructor)

    //instancia
    /*val smartTvDevice = SmartDevice()

    //smartTvDevice.turnOn()
    //smartTvDevice.turnOff()
    //smartTvDevice.speakerVolume = 110
    println(smartTvDevice.speakerVolume)*/


    //ej 9 class con constructor Forma 1

    /*val smartTvDevice = SmartDevice("Samsung", "Qled")
    smartTvDevice.showNameAndCategory()*/


    //ej 10 superclass - subclass
    /*val smartTvDevice = SmartTvDevice("Samsung", "Qled");
    smartTvDevice.speakerVolume = 200;*/

}

//class sin constructor
/*class SmartDevice {
    //properties
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"
    var speakerVolume = 2

    get() = field + 100
    set(speakerVolume) {
        if (speakerVolume in 0..100) {
            field = speakerVolume
        } else{
            println("error")
        }
    }

    //methods
    fun turnOn(){
        println("Smart device is turned ON.")
    }

    fun turnOff(){
        println("Smart device is turned OFF.")
    }
}*/

//class con constructor Forma 1
/*class SmartDevice(private val name: String, private val category: String) {

    fun showNameAndCategory(){
        println("Name: $name, Category: $category")
    }

}*/


//class con constructor Forma 2
/*class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
}*/



//superclass - subclass
/*open class SmartDevice(name: String, category: String){

}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            } else {
                println("error");
            }
        }
}*/
