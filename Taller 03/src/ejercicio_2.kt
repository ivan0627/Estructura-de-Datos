/*
. Un vendedor recibe una comisión por el volumen de ventas que realice.
Las reglas para asignarle la comisión al vendedor son las siguientes:
Ventas Comisión
Inferior a 50 mil pesos 7% de las ventas
Entre 50 mil y 100 mil pesos 9% de las ventas más 5 mil pesos
Entre 100 mil y 200 mil pesos 11% de las ventas más 10 mil pesos
Entre 200 mil y 500 mil pesos 13% de las ventas más 20 mil pesos
Más de 500 mil pesos 15% de las ventas más 40 mil pesos
o Escriba una función que recibe el valor de las ventas de un
vendedor y que retorne la comisión
o Escriba un programa que lea el valor de ventas de varios
vendedores de la empresa (finalizar cuando las ventas sean
negativas), y usando la función anterior, calcule la comisión y la
imprima por pantalla.
 */

fun calculoComision (entradaVentas: Double){
    if (entradaVentas > 0 && entradaVentas <=50000){
        println("La comision correspondiente de ${entradaVentas} es: "+entradaVentas*7/100)
    }
    else if (entradaVentas > 50000 && entradaVentas <100000){
        println("La comision correspondiente de ${entradaVentas} es: "+entradaVentas*9/100)
    }
    else if (entradaVentas >= 100000 && entradaVentas <200000){
        println("La comision correspondiente de ${entradaVentas} es: "+entradaVentas*11/100)
    }
    else if (entradaVentas >= 200000 && entradaVentas <=500000){
        println("La comision correspondiente de ${entradaVentas} es: "+entradaVentas*13/100)
    }
    else if (entradaVentas > 500000){
        println("La comision correspondiente de ${entradaVentas} es: "+entradaVentas*15/100)
    }

}

fun main() {
    println("Por favor digite el volumen de ventas del trabajador: ")
    val entradaVentas = readLine()!!.toDouble()
    calculoComision(entradaVentas)
    do {
        println("Por favor digite el volumen de ventas del siguiente trabajador: ")
        val entradaVentas2 = readLine()!!.toDouble()
        calculoComision(entradaVentas2)
    }
    while (entradaVentas2 >0)
}