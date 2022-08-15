/*
Una librería ofrece dos tipos de descuentos ante la compra de un libro. Si
el libro tiene un precio inferior a cien mil pesos, el descuento es del 12%
del precio; pero en cualquier otro caso, el descuento asciende a un 18%.
o Escriba una función que halle el precio neto de un libro (precio
menos descuento) de un libro, dado el precio del libro.
o Ahora, escriba un programa que permita leer el precio de
varios libros (finalizar cuando el precio es cero o negativo) y
mostrar para cada libro, el precio neto (usando la función
desarrollada anteriormente)
 */

package Taller03

fun precio_neto (precio_libro:Double):Double =
    when {
        precio_libro<100_00->precio_libro-precio_libro*0.12
        else->precio_libro-precio_libro*0.18
    }

fun main() {
    var precio:Double
    print("Cual es el precio del libro: ")
    precio= readLine()!!.toDouble()
    if (precio>0){
        println("El precio neto del libro es ${precio_neto(precio)}")
        println("Cual es el precio del libro: ")
        precio = readLine()!!.toDouble()
    }
}