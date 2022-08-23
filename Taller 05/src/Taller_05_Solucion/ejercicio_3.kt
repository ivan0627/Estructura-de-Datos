package Taller_05_Solucion

/*
3. Desarrolle la siguiente función y programa
a. Escriba una función que reciba una lista de palabras y retorne
cuántas palabras en la lista son verbos (es decir, terminan en
"ar", "er" o "ir").
b. Escriba un programa que lea una serie de palabras, las guarde
en una lista, y luego, usando la función anterior, muestre
cuántas palabras en la lista son verbos
 */

fun verbos(list:MutableList<String>):Int {
    var contador= 0
    for (verbo in list){
        var minuscula = verbo.toLowerCase()
        if (minuscula.endsWith("ar")||minuscula.endsWith("er")||minuscula.endsWith("ir"))
        {contador++}
    }
    return contador
}

fun main() {
    var num:Int
    println("Cuantas palabras desean ingresar?: ")
    num = readLine()!!.toInt()
    var lista:MutableList<String> = mutableListOf()
    repeat(num){
        println("Ingrese la palabra: ")
        var palabra = readLine()!!.toString()
        lista.add(palabra)
    }
    println("Del numero de palabras $num los verbos son ${verbos(lista)}")
}