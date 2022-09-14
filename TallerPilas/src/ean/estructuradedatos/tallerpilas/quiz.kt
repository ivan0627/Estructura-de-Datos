package ean.estructuradedatos.tallerpilas

import ean.collections.IStack
import ean.collections.TLinkedStack



    fun turing (pila : IStack<String>) :Int{
        var puntero = 1
        var copy = pila.copy()
        while (!copy.isEmpty){
            when (copy.peek()){
                "ZERO" -> puntero =0
                "INC" -> puntero =puntero+1
                "DEC" -> puntero =puntero-1
                "DUP" -> puntero =puntero*2
                "HALF" -> puntero =puntero/2
                "STOP" -> break
            }
            copy.pop()
        }
        return puntero
    }
fun main() {

    var pila: IStack<String> = TLinkedStack()
    pila.push("STOP")
    pila.push("HALF")
    pila.push("INC")
    pila.push("INC")
    pila.push("DUP")
    pila.push("DUP")
    pila.push("INC")

    print(turing(pila))

}

