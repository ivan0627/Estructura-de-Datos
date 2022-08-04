package solucion_taller2

fun dia (x:String):String {
    val manana:String
    manana=when(x){
        "lunes"->"Martes"
        "martes"->"Miercoles"
        "miercoles"->"Jueves"
        "jueves"->"Viernes"
        "viernes"->"Sabado"
        "sabado"->"Domingo"
        "domingo"->"Martes"
        else -> "Entrada no valida"
    }
    return manana
}

fun main() {
    println("Por favor digite el dia: ")
    val dia = readln()!!.toLowerCase()
    println("Mañana es: "+dia(dia))
}