/*
Escriba una función que reciba un número entero positivo y que
encuentre el factorial de un número. Luego escriba un programa que lea
un número entero, y que halle e imprima los factoriales de todos los
números enteros entre 1 y el número ingresado desde el teclado. Debe
usar la función de factorial realizada.
 */

fun main(){
    print("Digite el número entero positivo hasta el cual se generarán los números factoriales: ")
    var n= readLine()!!.toInt()

    for (i in 1..n){
        println("${i}! = ${calcularFactorial(i)}")
    }

}
fun calcularFactorial(n:Int):Int{
    var r=1
    for(i in 1..n){
        r=r*i
    }
    return r
}