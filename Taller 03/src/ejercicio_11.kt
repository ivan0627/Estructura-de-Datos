
/*
Un número entero positivo es perfecto si la suma de sus divisores
inferiores es igual al número. Por ejemplo, el número 6 es perfecto, ya
que la suma de sus divisores inferiores, o sea, 1+2+3=6 es igual al
número 6. Primero, escriba una función que reciba un número y que
indique si ese número es perfecto o no. USE LA FUNCIÓN desarrollada
en el ejercicio anterior. Luego escriba un programa que lea un número
entero y que imprima los diversos números perfectos que hay entre 1 y el
número ingresado desde el teclado. El programa también debe contar esa
cantidad de números perfectos e imprimir esa cantidad al final del
programa.
 */

package Taller03

fun main(){
    var p=""
    print("Digite el número entero positivo a evaluar: ")
    var n= readLine()!!.toInt()
    var c=0
    for(i in 1..n){
        var perfecto= hallarPerfecto(i)
        if(perfecto==1){
            c++
            p=when{
                p=="" -> i.toString()
                else -> p+","+i
            }
        }
    }
    println("Existen $c números perfectos entre 1 y $n")
    println("Los números perfectos son ${p}")
}
fun hallarPerfecto(n:Int):Int{
    var perfecto=0
    var (s,divisores)= numeroDivisoressinn(n)
    perfecto=when{
        s==n->1
        else -> 0
    }
    return perfecto
}
