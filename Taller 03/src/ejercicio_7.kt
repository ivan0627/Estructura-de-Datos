/*
Escriba una función que reciba un número entero positivo y que
encuentre y retorne el número de divisores que tiene ese número. Luego
escriba el programa que lea un número e imprima la cantidad de divisores
que tiene ese número.
 */

package Taller03

fun main(){

    print("Digite el número entero positivo a evaluar: ")
    var n= readLine()!!.toInt()
    var (c,divisores)= numeroDivisores(n)
    println("El numero ${n} tiene en total $c divisores")
    println("Sus divisores son $divisores")
}
fun numeroDivisores(n:Int): Pair<Int,String>{
    var c=0
    var divisores =""
    for(i in 1..n){
        val modulo=n%i
        if(modulo==0){
            c++
            divisores=when(c){
                1 -> i.toString()
                else -> divisores+","+i
            }

        }
    }
    return c to divisores
}