package Taller_05_Solucion

import java.util.*

/*
Escriba un función que reciba una lista de pares (el primer
elemento es el nombre de un estudiante, y el segundo es el
año de nacimiento) y que retorne el nombre del estudiante más
viejo de toda la lista.
b. Escriba el programa que lea el nombre y año de nacimiento de
N estudiantes de la universidad, almacene cada par en una
lista, y luego de terminar la lectura, y usando la función
anterior, imprima el nombre del estudiante más viejo.

*/

fun older (lista : MutableList<Pair<String,Int>>):Pair<String, Int>{
    var edad = 0
    var mayor = ""
    for ((nombre,edadIngresada) in lista){
        var fecha= Calendar.getInstance().get(Calendar.YEAR);
        var edadEstudiante = fecha - edadIngresada
         if (edadEstudiante > edad){
             edad = edadEstudiante
             mayor = nombre
       }

    }
    return Pair(mayor, edad)
}

fun main() {
    var lista : MutableList<Pair<String, Int>> = mutableListOf()
    var contador = 1
    println("Por favor digite el numero de estudiantes a registrar: ")
    var N = readLine()!!.toInt()
    println("Por favor digite el nombre y año de nacimiento del estudiante #$contador separado por , ")
    var entrada = readLine()!!
    var nombre = entrada.split(",")[0].capitalize()
    var edadIngresada = entrada.split(",")[1].toInt()

    repeat(N-1){
        contador ++
        lista.add(Pair(nombre, edadIngresada))
        println("Por favor digite el nombre y edad del estudiante #$contador separado por , ")
         entrada = readLine()!!
         nombre = entrada.split(",")[0].capitalize()
         edadIngresada = entrada.split(",")[1].toInt()
    }

    println("El estudiante con mas edad es ${older(lista)} ")
}