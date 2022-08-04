package solucion_taller2

import kotlin.math.PI
import kotlin.math.pow

/*
 Escriba una función que halle el área de un círculo de acuerdo a la
siguiente fórmula: A=π×r2. Ahora escriba una función que halle el área de
la corona circular (región en verde en la siguiente figura) a partir de la
resta de las áreas del círculo grande (con radio R) y el círculo pequeño
(con radio r). En esta segunda función debe usar la primera. Además
escriba un programa que lea el valor de los dos radios y, usando la función anterior, calcule y halle el área de la corona circular.

 */

fun area (r: Double) = PI*r.pow(2)
fun corona (R:Double, r: Double) = area(R)- area(r)

fun main() {
    println("Por favor digite el valor del radio del circulo grande: ")
    val R = readLine()!!.toDouble()
    println("Por favor digite el valor del radio del circulo pequeño: ")
    val r = readLine()!!.toDouble()
    println("El area del circulo grande es: ${area(R)}, el area del circulo pequeño es: ${area(r)} el area de la corona por lo tanto es: ${corona(R,r)} ")
}