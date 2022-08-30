package Taller_05_Solucion

/*
Desarrolle la siguiente función y programa
a. Escriba una función que reciba una lista de pares (el primer
elemento es la placa de un carro y el segundo elemento es el
precio de ese carro), y una placa, y que retorne el precio del
carro que tiene esa placa. Si no encontramos un carro con esa
placa, retornamos -1
b. Ahora escriba un programa que lea las placas y precios de
varios carros (para finalizar, podemos indicar que la placa sea
vacía o que el precio sea cero o negativo), arme un par con
esos datos y los guarde en una lista y luego, lea una placa, y
usando la función anterior, halle el precio del carro que tiene
esa placa. Si no encontramos la placa

 */

fun precio_carro (lista:MutableList<Pair<String, Double>>, placa : String):Double{
    var p=-1.0
    for ((plac, precio) in lista){
        if (plac == placa){p= precio}
    }
    return p}
fun main() {
    var lista :MutableList<Pair<String, Double>> = mutableListOf()
    var placa: String
    var precio:Double
    print("Ingrese placa: ")
    placa = readLine()!!.toString()
    println("Ingrese el precio: ")
    precio = readLine()!!.toDouble()
    lista.add(Pair(placa, precio))
    while (placa!="" || precio>0){
        print("Ingrese placa: ")
        placa = readLine()!!.toString()
        println("Ingrese el precio: ")
        precio = readLine()!!.toDouble()
        lista.add(Pair(placa, precio))
    }
    println("Que placa desea bucar?: ")
    var placa_buscar  = readLine()!!.toString()
    println(precio_carro(lista,placa_buscar))
}