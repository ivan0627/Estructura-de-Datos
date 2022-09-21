package ean.estructuradedatos.tallerpilas

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 * <p>
 * Proyecto Taller con las Pilas
 * Autor: Universidad EAN - Marzo 18, 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*
import java.lang.Math.pow
import kotlin.math.exp

/**
 * Objeto que permite convertir una expresión infija normal a una expresión en notación
 * postfija. Utiliza pilas para realizar la conversión.
 */
object Evaluador {

    //-------------------------------------
    // Métodos
    //-------------------------------------

    /**
     * Verifica que la expresión tiene los símbolos de agrupación bien balanceados
     * @return true si la expresión está balanceados
     */
    fun estánSímbolosAgrupaciónBalanceados(expresion: IList<String>): Boolean {
        val pilaSimbolos: IStack<String> = TLinkedStack()

        for (n in expresion) {
            if (n == "(" || n == "{" || n == "[") {
                pilaSimbolos.push(n)
            } else {
                if (n == ")" || n == "}" || n == "]") {
                    if (pilaSimbolos.isEmpty) {
                        return false
                    }
                    val tope = pilaSimbolos.peek()
                    pilaSimbolos.pop()
                    if ((tope == "(" && n != ")") || (tope == "{" && n != "}") || (tope == "[" && n != "]")) {
                        return false
                    }
                }
            }
        }
        return pilaSimbolos.isEmpty
    }

    /**
     * Transforma la expresión, cambiando los simbolos de agrupación [] y {} por ()
     */
    fun reemplazarDelimitadoresPorParéntesis(expresion: IList<String>): Unit {
        val lista: MutableList<String> = mutableListOf()
        for (n in expresion) {
            if (n == "{" || n == "[") {
                lista.add("(")
            } else {
                if (n == "}" || n == "]") {
                    lista.add(")")
                } else {
                    lista.add(n)
                }
            }
        }
        expresion.clear()
        for (i in lista) {
            expresion.add(i)
        }

    }

    /**
     * Realiza la conversión de la notación infija a postfija
     * @return la expresión convertida a postfija
     */
    fun convertirAPostfijo(expresion: IList<String>): IList<String> {
        val pila: IStack<String> = TLinkedStack()
        val lista: IList<String> = TList()

        for (n in expresion) {
            if (n == "+" || n == "-" || n == "/" || n == "*" || n == "%") {
                pila.push(n)
            } else if (n == "(") {
                continue
            } else if (n == ")") {
                lista.add(pila.peek())
                pila.pop()
            } else {
                lista.add(n)
            }
        }

        return lista;
    }

    /**
     * Realiza la evaluación de la expresión postfija almacenada en la lista
     * llamada "expresión". Realiza las operaciones de acuerdo al algoritmo
     * presentado.
     */
    fun evaluarExpresiónPostfija(expression: IList<String>): Int {
        val pila: IStack<Int> = TLinkedStack()
        for (p in expression) {
            var elem = p
            if (elem == "+" || elem == "-" || elem == "*" || elem == "/" || elem == "%" || elem == "**") {
                var peek = pila.peek()
                pila.pop()
                var peek2 = pila.peek()
                pila.pop()
                when (elem) {
                    "+" -> pila.push(peek2 + peek)
                    "-" -> pila.push(peek2 - peek)
                    "*" -> pila.push(peek2 * peek)
                    "/" -> pila.push(peek2 / peek)
                    "%" -> pila.push(peek2 % peek)
                    "**" -> pila.push(pow(peek2.toDouble(), peek.toDouble()).toInt())
                }
            } else {
                pila.push(elem.toInt())
            }
        }
        return pila.peek()
    }

    fun SolucionTerminoPostFijo(expresion: String): Int {
        var pila: IStack<Int> = TLinkedStack()
        var resultado = 0
        var primerValor = 0
        var segundoValor = 0
        for (i in expresion) {
            if (i.toString() == "+" || i.toString() == "-" || i.toString() == "*" || i.toString() == "/" || i.toString() == "**"
                || i.toString() == "%"
            ) {
                primerValor = pila.peek()
                pila.pop()
                segundoValor = pila.peek()
                pila.pop()

                when (i.toString()) {
                    "+" ->{
                        resultado =  segundoValor + primerValor
                        pila.push(resultado)
                    }

                    "-" -> {
                        resultado = segundoValor - primerValor
                        pila.push(resultado)
                    }

                    "*" -> {
                        resultado = segundoValor * primerValor
                        pila.push(resultado)
                    }
                    "/" -> {
                        resultado = segundoValor / primerValor
                        pila.push(resultado)
                    }
                    "%" -> {
                        resultado = segundoValor % primerValor
                        pila.push(resultado)
                    }
                }
            } else {
                if (i.toString() != ""){
                    val numero = i.toString().toInt()
                    pila.push(numero)
                }
            }

        }

        return pila.peek()

    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(SolucionTerminoPostFijo("23*93/+"))
    }
}

