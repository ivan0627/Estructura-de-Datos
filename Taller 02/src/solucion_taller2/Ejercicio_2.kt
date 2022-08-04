package solucion_taller2

/*
El paseo: cuando termine esta pandemia, vamos a organizar un paseo. Al
paseo irán estudiantes gordos y flacos. Un estudiante gordo ocupa dos
sillas de un bus y un estudiante flaco ocupa solo una silla. Si sabemos
cuánta sillas tiene un bus, cuántos estudiantes gordos van al paseo y
cuántos estudiantes flacos van al paseo, escriba una función y un
programa que encuentre el número de buses que se necesitan alquilar
para llevar todos esos estudiantes al paseo.
 */

fun paseo (flacos: Int, gordos: Int, sillas: Int) :Double{
    var nBuses =Math.ceil(((gordos*2.0)+flacos)/sillas)
    return nBuses
}

fun main() {
    println("Por favor digite la cantidad de sillas: ")
    val sillas= readLine()!!.toInt()
    println("Por favor digite la cantidad de personas gordas")
    val gordos = readLine()!!.toInt()
    println("Por favor digite le numero de flacos: ")
    val flacos = readLine()!!.toInt()
    println(paseo(flacos, gordos, sillas))
}