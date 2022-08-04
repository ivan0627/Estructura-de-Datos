package solucion_taller2
/*
Escribir una función que reciba dos números enteros y retorne el mayor
número de los dos. Escriba un programa, que lea dos números enteros, y
usando la función anterior, imprima el mayor de los dos.

*/

fun mayor(number: List<Int>) = number.max()
fun main() {

    var lista = mutableListOf<Int>()
    println("Digite el primer numero: ")
    var primero = readLine()!!.toInt()
    lista.add(primero)
    println("Digite el segundo numero: ")
    var segundo = readLine()!!.toInt()
    lista.add(segundo)

    println("El numero mayor entre los dos numero es: ${mayor(lista)}")
}