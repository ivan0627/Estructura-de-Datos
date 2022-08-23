package Taller_05_Solucion

/*
Escriba una función que reciba una lista con la altura en metros de las
personas que viven en la ciudad y un número real, y que retorne cuántas
alturas en la lista se encuentran por debajo de ese número.

También escriba otra función que reciba esa misma lista de alturas y que retorne el
promedio de todas las alturas de la lista.

Finalmente escriba un programa que lea la altura de varias personas (hasta que esta altura sea mayor a 3
metros o negativa), guarde cada una en la lista y USANDO LAS DOS
FUNCIONES desarrolladas, imprima el promedio de altura de la lista y la
cantidad de alturas que están por debajo de ese promedio
 */

fun altura (lista: MutableList<Double>, referencia: Double):Int{
    var contador = 0
    for (i in lista){
        if (i <referencia){
        contador ++}
    }
    return  contador
}
fun promedio (lista: MutableList<Double>) :Double{
    var totalAlturas =0.0
    for (i in lista){totalAlturas+=i}

    var resultado = totalAlturas.toDouble()/lista.size
    return resultado
}


fun main() {
    var lista:MutableList<Double> = mutableListOf()
    println("Digite la altura de la persona en metros: ")
    var altura = readLine()!!.toDouble()

    while (altura <3){
        lista.add(altura)
        println("Digite la altura de la persona en metros: ")
        altura = readLine()!!.toDouble()
         }

    var promedio = promedio(lista)
    println("El promedio de las alturas digitadas es: $promedio")
    println("Hay ${altura(lista, promedio)} personas por debajo del promedio")

}