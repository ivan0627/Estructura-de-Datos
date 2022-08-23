package Taller_05_Solucion

/*
Escriba una función que reciba una lista de números donde estén
almacenadas las edades de los estudiantes de la
universidad y que retorne cuántos estudiantes de la lista nacieron el siglo
pasado y el promedio de edad de todos los estudiantes de la lista. El
programa debe leer las edades, guardar cada una en la lista y usar la
función para mostrar los datos de salida correspondientes.
 */

fun siglo_pasado(list: MutableList<Int>):Pair<Int,Float>{
    var sigloPasado = 0
    var suma =0.0
    for (edad in list){
        if(edad>=23){
            sigloPasado++
        }
        suma+=edad

    }
    var promedio = suma/list.size
    return Pair(sigloPasado, promedio.toFloat())
}

fun main() {
    var lista:MutableList<Int> = mutableListOf()
    println("Ingrese una edad: ")
    var edad = readLine()!!.toInt()
    while (edad>0){
        lista.add(edad)
        print("Ingrese una edad: ")
        edad = readLine()!!.toInt()
    }

    var (primera, segunda) = siglo_pasado(lista)
    println("Los estudiantes del siglo pasado son: $primera")
    println("El promedio de edad es: $segunda")
    println(lista)
}