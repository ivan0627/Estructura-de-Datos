package solucion_taller2
/*
Una empresa inmobiliaria vende terrenos con la forma a continuación:
Escriba funciones que nos ayuden a encontrar el área y el perímetro del
terreno.
o Escriba una función que halle el área de un rectángulo a partir
de su base y su altura
o Escriba una función que halle la hipotenusa de un triángulo
rectángulo a partir de los catetos del triángulo.
o Encuentre el área de un triángulo a partir de su base y su altura
o Encuentre el perímetro del terreno a partir de los lados A, B, C
(hay que encontrar la hipotenusa).
o El programa debe leer las dimensiones de los 3 lados y hallar el
área y el perímetro del terreno usando las funciones anteriores.
 */
import kotlin.math.pow
import kotlin.math.sqrt

fun areaRectangulo(b:Double,c:Double) = b*c
fun hipotenusa (a:Double, b:Double) = sqrt(b.pow(2)+b.pow(2))
fun areaTriangulo(b:Double,a:Double, c:Double) = (b*a-c)/2
fun perimetroTerreno(a:Double, b:Double, c:Double)=a+b+c+ hipotenusa(a,b)
fun main() {
    println("Por favor digite el valor para el lado A: ")
    var a = readLine()!!.toDouble()
    println("Por favor digite el valor para el lado B: ")
    var b = readLine()!!.toDouble()
    println("Por favor digite el valor para el lado C: ")
    var c = readLine()!!.toDouble()
    println("El perimetro del terreno es: ${perimetroTerreno(a,b,c)} y el area del terreno es: ${areaRectangulo(b,c)+ areaTriangulo(b,a,c)} ")

}