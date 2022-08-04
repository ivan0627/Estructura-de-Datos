package solucion_taller2

import kotlin.math.PI
import kotlin.math.ceil
import kotlin.math.roundToInt
import kotlin.math.sin

/*
Escriba una función que calcule la longitud de la escalera y si conocemos
la altura que tiene la escalera (x) cuando esta inclinada sobre la pared con
un ángulo α. Tenga en cuenta la siguiente figura:
Escriba el programa que use la función anterior para hallar la longitud de
la escalera a partir de los otros datos.
 */

fun escalera (x:Double, a:Double) = x/ sin(a*PI/180)

fun main() {
    println("Por favor digite el valor de x: ")
    val x = readLine()!!.toDouble()
    println("Por favor digite el valor del angulo: ")
    val a = readLine()!!.toDouble()
    println("El largo de la escalera es: ${(escalera(x,a))}")
}
