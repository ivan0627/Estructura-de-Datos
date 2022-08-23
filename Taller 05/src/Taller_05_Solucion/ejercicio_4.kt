package Taller_05_Solucion

/*
Desarrolle la siguiente función y programa
a. Escriba una función que reciba una lista con las notas de todos
los estudiantes del curso, y que retorne cuántos estudiantes
perdieron el curso y cuál fue el promedio del curso.

b. Ahora escriba un programa que lea la nota de los N estudiantes
del curso y almacene cada una de esas notas en una lista,
luego, usando la función anterior, imprima la siguente
información: cuántos ganaron el curso, cuántos perdieron el
curso y cuál fue el promedio del curso.
 */

fun notas (listaNotas: MutableList<Double>):Int{
    var contador = 0
    for (i in listaNotas){
        if (i <6){
            contador ++}
    }
    return  contador
}
fun promedioCurso (lista: MutableList<Double>) :Double{
    var totalNotas =0.0
    for (i in lista){totalNotas+=i}

    var resultado = totalNotas.toDouble()/lista.size
    return resultado
}


fun main() {
    var listaNotas:MutableList<Double> = mutableListOf()
    println("Digite el numero de estudiantes: ")
    var estudiantes = readLine()!!.toInt()
    var estudiante = 1
    println("Digite la nota del estudiante #$estudiante: ")
    var nota = readLine()!!.toDouble()

    repeat(estudiantes-1){
        estudiante++
        listaNotas.add(nota)
        println("Digite la nota del estudiante #$estudiante: ")
        nota = readLine()!!.toDouble()
    }

    var promedioNotas = promedioCurso(listaNotas)
    println("El promedio de las notas digitadas es: $promedioNotas")
    var reprobados = notas(listaNotas)
    println("Hay ${notas(listaNotas)} estudiantes que no superaron los logros")
    var restante = estudiantes - reprobados
    println("Hay " + restante +" estudiantes que superaron los logros")

}