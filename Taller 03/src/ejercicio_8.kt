
package Taller03

/*
Escriba una función, la cual, USANDO LA FUNCIÓN DEL EJERCICIO
ANTERIOR, reciba un número entero y determine si ese número es primo
o no. Un número es primo si y solo si, tiene 2 divisores. Luego escriba un
programa que lea un número entero e imprima todos los números primos
que hay entre 2 y el número entero que se ingresó desde el teclado.
Debe usar la función desarrollada para saber si un número es primo.

 */

fun calcularPrimos(n:Int):String{
    var p=""
    for(i in 2..n){
        var (c,divisores)= numeroDivisores(i)
        if(c==2){
            p=when{
                p=="" -> i.toString()
                else -> p+","+i
            }
        }
    }
    return p
}
fun main(){
    print("Digite el número entero positivo hasta el cual se generarán los números primos: ")
    var n= readLine()!!.toInt()
    println("Los números primos son ${calcularPrimos(n)}")
}