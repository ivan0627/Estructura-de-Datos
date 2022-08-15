
/*
Elabore un programa que genere e imprima la tabla de multiplicar del 1 al
10 de un número entero positivo que es ingresado por pantalla. User
un for o un while o un repeat para resolver el problema.
 */

fun main() {
    print("Digite numero entero positivo a multiplicar: ")
    var numero = readLine()!!.toInt()
    println("TABLA DE MULTIPLICAR DEL $numero")

        for (i in 1 ..10) {
        println("$numero x $i = ${numero*i}")}

}