fun main(){
    println(transformaADouble(5))
    println(diHola("Carlos"))
    println(diEdad("Carlos", 33))
}

fun transformaADouble(number: Int) : Long{
    return number.toLong()
}

fun diHola(name : String) : String{
    return "Hola $name!"
}

fun diEdad(name : String, edad : Int) : String{
    return "Soy $name, y tengo $edad años"
}