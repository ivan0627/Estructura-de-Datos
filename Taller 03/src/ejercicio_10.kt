/*
.Escriba una función que reciba un número entero positivo, y que retorne
la suma de los divisores de ese número que son inferiores al número. Es
decir, la función debe sumar los divisores del número 𝑛, que se
encuentran entre 1 y 𝑛−1. Por ejemplo, los divisores de 18 son 1,2,3,6,9,18.
Pero la suma de los divisores inferiores no debe tener en cuenta el
número, es decir, para el 18, la suma de sus divisores inferiores
sería 1+2+3+6+9=21. Escriba un programa que, usando la función anterior,
lea un número entero y obtenga la suma de los divisores inferiores de ese
número.
 */

package Taller03

fun main(){

    print("Digite el número entero positivo a evaluar: ")
    var n= readLine()!!.toInt()
    var (s,divisores)= numeroDivisoressinn(n)
    println("La suma de sus divisores es de $s, los valores son $divisores=$s")
}
fun numeroDivisoressinn(n:Int): Pair<Int,String>{
    var s=0
    var divisores =""
    for(i in 1..(n-1)){
        val modulo=n%i
        if(modulo==0){
            s=s+i
            divisores=when{
                divisores=="" -> i.toString()
                else -> divisores+","+i
            }

        }
    }
    return s to divisores
}