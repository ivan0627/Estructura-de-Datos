package ean.estructuradedatos.tallercolas

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 * <p>
 * Proyecto Taller con las Colas
 * Autor: Universidad EAN - Marzo 18, 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
data class Producto(val codigo:Int,val titulo:String,val pagina:Int,val ano:Int){

}

data class Categoria(var codigo:Int,var nombre:String,var puntos:Int,var vigente:Boolean){

}

fun colas ( cola: IQueue<Any>, codigo:Int): String? {
    var copy = cola.copy()
    var valor = ""
    while (!copy.isEmpty) {
        if (copy.front == codigo) {
            valor = "Si"
            copy.dequeue()
        } else {
            copy.dequeue()
        }
    }
    if (valor != "Si"){
        return null
    }

    return valor
}


fun main() {

    val codigos = 42
    val titulo = "Home"
    val pagina = 5
    val ano = 1998

    val codigo = 15
    val nombre = "ivan"
    val puntos = 15
    val vigente = true

    val categoria = Categoria(15, "Asd", 15, true)
    var cola: IQueue<Any> = TLinkedQueue()

    cola.enqueue(categoria.codigo)
    cola.enqueue(categoria.nombre)
    cola.enqueue(categoria.puntos)
    cola.enqueue(categoria.vigente)
     var verifcola =  colas(cola,15)
    if (verifcola.equals("Si")){
        println(categoria.nombre)
    }
    val producto = Producto(codigo, titulo, pagina, ano)

    print(colas(cola, 15))
    print(producto.pagina)
}