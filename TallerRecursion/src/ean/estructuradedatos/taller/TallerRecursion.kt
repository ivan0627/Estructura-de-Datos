package ean.estructuradedatos.taller

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Taller Funciones Recursivas
 * Fecha: 18 de marzo de 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.IList
import ean.collections.TList
import ean.collections.newLinkedList
import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt
fun Int.isEven(): Boolean = this%2==0
fun Int.lastDigit():Int = this%10

/**
 * Halla el factorial del número entero n
 * n! = n * (n-1) * (n-2) * ... * 2 * 1
 */
fun factorial(n: Int): Int =
    when (n) {
        0, 1 -> 1
        else -> n*factorial(n - 1)
    }

/**
 * Halla el n-ésimo término de la serie de fibonacci
 */
fun fibonacci(n: Int): Int =
    when(n){
        1,2 -> 1
        else ->  fibonacci(n-1) + fibonacci(n-2)
    }

/**
 * Permite determinar el término n,m del triángulo de Pascal
 * n = fila, m = término
 */
fun pascal(n: Int, m: Int): Int =  when{
    m==n+1 || n<=1 || m==1-> 1
    else -> pascal(n-1,m-1)+ pascal(n-1,m)
}

/**
 * Halla el valor de a^b
 */
fun elevar(a: Int, b: Int): Int = when(b){
        0 -> 1
        1 -> a
        else -> a * elevar(a,b-1)
}
/**
 * Halla la suma de todos los números enteros entre 1 y n
 */
fun sumatoria(n: Int): Int = when(n) {
    1 -> 1
    else -> n + sumatoria(n-1)
}
/**
 * Halla la suma de los cuadrados de los números de 1 hasta n
 */
fun sumaCuadrados(n: Int): Int = when(n) {
    1 -> 1
    else -> n*n+sumaCuadrados(n-1)
}

/**
 * Hallar el valor de la serie 1/(2i+1) desde  1 hasta n
 */
fun serie(n: Int): Double = when{
    n == 1 -> (1/(2*n.toDouble()+1))
    else -> (1/(2*n.toDouble()+1)) + serie(n-1)
}

/**
 * Permite saber la cantidad de digitos que posee un número entero positivo n
 */
fun contarDigitos(n: Int): Int = when{
    n/10<1 ->1
    else -> 1+ contarDigitos(floor(n/10.toDouble()).toInt())
}

/**
 * Permite hallar la suma de los dígitos de un número entero positivo n
 */
fun sumarDigitos(n: Int): Int = when {
    n/10<1 ->n
    else -> {
        var z =when{
            n>=1000 -> (((n%1000)%100)%10)
            n>=100 -> ((n%100)%10)
            n>=10 -> (n%10)
            else -> 0
        }
        z.toInt() + sumarDigitos(floor(n/10.toDouble()).toInt())
    }
}

/**
 * Un número entero positivo en múltiplo de 3 si:
 *  - tiene una cifra y es 0, 3, 6, o 9
 *  - tiene más de una cifra y la suma de sus dígitos es múltiplo de 3
 *  - en cualquier otro caso, el número no es múltiplo de 3
 *
 *  - NO PUEDEN USAR LA OPERACIÓN MÓDULO (%)
 */
fun esMultiploDe3(n: Int): Boolean {
    var valor = sumarDigitos(n)
    var retorno:Boolean
    when{
        valor < 10 -> {
            when{
                valor==0 || valor==3 || valor==6 || valor==9 -> retorno = true
                else -> retorno=false
            }
        }
        else -> {
            retorno = esMultiploDe3(valor)
        }
    }
    return retorno
}
/**
 * Cuenta el número de dígitos pares que tiene un número entero positivo >= 1
 */
fun cantidadDigitosPares(n: Int): Int {
    var retorno=0
    var z =when{
        n>=10000000 -> (((((((n%10000000)%1000000)%100000)%10000)%1000)%100)%10)
        n>=1000000 -> ((((((n%1000000)%100000)%10000)%1000)%100)%10)
        n>=100000 -> (((((n%100000)%10000)%1000)%100)%10)
        n>=10000 -> ((((n%10000)%1000)%100)%10)
        n>=1000 -> (((n%1000)%100)%10)
        n>=100 -> ((n%100)%10)
        n>=10 -> (n%10)
        else -> n
    }
    when{
        z<1 && n>10 ->retorno=1+ cantidadDigitosPares(floor(n/10.toDouble()).toInt())
        z<1 ->retorno=0
        else -> {
            if(z%2==0){
                retorno = 1+ cantidadDigitosPares(floor(n/10.toDouble()).toInt())
            }
            else {
                retorno = 0+ cantidadDigitosPares(floor(n/10.toDouble()).toInt())
            }
        }
    }
    return retorno
}

/**
 * Determina si el número dado es binario o no.
 * Los números binarios solo contienen los dígitos 1 y 0
 * Por ejemplo: el numero 100011110 es binario, pero 231 no lo es
 */
fun esNumeroBinario(n: Int): Boolean {
    if (n in 0..9) {
        return n == 0 || n == 1
    } else {
        return if (n % 10 != 0 || n % 10 != 1) {
            esNumeroBinario(n / 10)
        } else {
            false
        }
    }
}

/**
 * Permite saber si el número dado posee el dígito indicado
 */
fun poseeDigito(n: Int, digito: Int): Boolean {
    /*
    si el numero n posee un solo digito, entonces
       si n y el digito son iguales -> retorne true sino retorne false
    sino si el número n tiene más de un dígito, entonces
       si el ultimo dígito del número n es igual al dígito, entonces
         listo, lo encontramos, retorne true
       sino
         halle el resto de n
         mire si el resto de n posee el dígito indicado
     */
    TODO()
}

/**
 * Retorna el dígito más grande que hace parte del número n
 * Ejemplo: el dígito más grande del númer 381704 es el 8
 */
fun digitoMasGrande(n: Int): Int {
    var retorno=0
    var z =when{
        n>=10000000 -> (((((((n%10000000)%1000000)%100000)%10000)%1000)%100)%10)
        n>=1000000 -> ((((((n%1000000)%100000)%10000)%1000)%100)%10)
        n>=100000 -> (((((n%100000)%10000)%1000)%100)%10)
        n>=10000 -> ((((n%10000)%1000)%100)%10)
        n>=1000 -> (((n%1000)%100)%10)
        n>=100 -> ((n%100)%10)
        n>=10 -> (n%10)
        else -> n
    }
    when{
        n<10 ->retorno=z
        else -> {
            if(z>digitoMasGrande(floor(n/10.toDouble()).toInt())){
                retorno =z
            }

            else {
                retorno =  digitoMasGrande(floor(n/10.toDouble()).toInt())
            }
        }
    }
    return retorno
}

/**
 * Imprimir cada elemento de la lista, pero de manera recursiva
 */
fun <T> imprimirLista(lista: IList<T>) {
    when{
        lista.isEmpty -> 0
        else -> {
            println(lista[0])
            imprimirLista(lista.tail())
        }
    }
}

/**
 * Obtiene recursivamente la lista de los dígitos del número entero positivo n
 * Ejemplo: digitos(351804) == [3, 5, 1, 8, 0, 4]
 */
fun digitos(n: Int): IList<Int> {
    var lista:IList<Int> = TList()
    var z:Int =when{
        n>=10000000 -> (((((((n%10000000)%1000000)%100000)%10000)%1000)%100)%10)
        n>=1000000 -> ((((((n%1000000)%100000)%10000)%1000)%100)%10)
        n>=100000 -> (((((n%100000)%10000)%1000)%100)%10)
        n>=10000 -> ((((n%10000)%1000)%100)%10)
        n>=1000 -> (((n%1000)%100)%10)
        n>=100 -> ((n%100)%10)
        n>=10 -> (n%10)
        else -> n
    }
    when{
        n<10 -> lista.add(z)
        else -> {
            lista.add(z)
            lista=digitos(floor(n/10.toDouble()).toInt())+lista
        }
    }
    return lista
}

/**
 * Dado un número entero positivo >= 0, retorna una lista con la representación binaria
 * del número dado.
 * Ejemplo: convertirDecimalBinario(231) = List(1, 1, 0, 0, 1, 1, 1, 1, 1, 1)
 */
fun convertirDecimalBinario(n: Int): IList<Int> {
    if (n==0 || n ==1){
        return TList(n)
    }
    else{
        var lista: IList<Int> = convertirDecimalBinario(n/2)
        lista.add(n.lastDigit()%2)
        return lista
    }
}

/**
 * Recursion con listas: Hallar la suma de los números pares de la lista que se recibe
 * como parámetro.
 * Ejemplo: sumarParesLista([40, 21, 8, 31, 6]) == 54
 */
fun sumarParesLista(lista: IList<Int>): Int {
    if (lista.size ==0){
        return 0
    }
    else {
        var prim = lista.first
        var resto: IList<Int> = lista.tail()
        if (prim.isEven()){
            return sumarParesLista(resto)+prim
        }
        else {
            return sumarParesLista(resto)
        }
    }
}

/**
 * Recursión con listas: construir una función recursiva que retorne la posición del elemento en la lista
 * Si la lista está vacía, retorne -1. No se puede usar indexOf o lastIndexOf
 */
fun buscarElementoEnUnaLista(lista: IList<Int>, elem: Int): Int =when{
    lista.isEmpty -> -1
    lista[lista.indices.last]== elem -> lista.indices.last
    else -> buscarElementoEnUnaLista(lista.dropLast(1), elem)
}

/**
 * Traduce los diversos dígitos de la lista a un número entero
 * Ejemplo: convertirListaDigitosNumero([3, 4, 1, 7, 9]) == 34179
 */
fun convertirListaDigitosNumero(digitos: IList<Int>): Int {
    if(digitos.size == 1){
        return digitos.first
    }
    else{
        var primero = digitos.first
        digitos.removeFirst()
        var tamanoLista = digitos.size
        return primero*(Math.pow(10.0,tamanoLista.toDouble())).toInt()+ convertirListaDigitosNumero(digitos)
    }
}

/**
 * Función genérica y recursiva que permite saber si un elemento está dentro
 * de la lista. No debe usarse la función indexOf o contains. Debe ser
 * recursiva. Para buscar un elemento hay que tener en cuenta
 * - si la lista está vacía, el elemento no está
 * - si el primero de la lista es igual al elemento, retornamos true (el elemento está)
 * - sino es igual al primero, entonces hay que ver si el elemento está en el resto de la lista
 */
fun <T> existeElemento(lista: IList<T>, elem: T): Boolean {
    if(lista.isEmpty){
        return false
    }
    if(!lista.isEmpty&&lista.first == elem){
        return true
    }
    else{
        lista.removeFirst()
        return existeElemento(lista, elem)
    }
}

/** Escribir una función recursiva que, sin usar pilas ni colas
 * ni ninguna otra lista, obtenga la misma lista, pero invertida
 */
fun invertirLista(lista: IList<Char>): IList<Char> {
    if(lista.isEmpty){
        var inversa = lista
        return inversa
    }
    else {

        var primero = newLinkedList(lista.last)
        lista.removeLast()
        var inversa = primero + invertirLista(lista)
        return inversa
    }
}

/**
 * Una palabra es palíndrome si se lee igual de izquierda a derecha y de derecha
 * a izquierda. Esta función recibe la palabra (sin espacios) y de forma recursiva
 * determina si la palabra es palíndrome.
 */
fun esPalindrome(palabra: String): Boolean {
    if (palabra.length == 1) {
        return true
    } else {
        var primero = palabra.first()
        var ultimo = palabra.last()

        if (primero == ultimo) {
            var palabra1 = palabra.substring(1)
            palabra1 = palabra1.substring(0, palabra1.length - 1)
            return esPalindrome(palabra1)
        } else {
            return false
        }
    }
}
/**
 * Recursividad con listas. Escriba una función recursiva
 * Obtiene el número más grande de la lista. Si la lista está vacía retorne el número
 * entero más pequeño.
 */
fun mayorDeUnaLista(lista: IList<Int>): Int {
    fun mayorDeUnaLista(lista: IList<Int>): Int {
        if(lista.isEmpty){
            return 0
        }
        else if(lista.size==1){
            return lista.first
        }
        else{
            val ultimo = lista.last
            val penultimo = lista.get(lista.size-2)
            if(ultimo>penultimo){
                lista.remove(lista.size-2)
            }
            else{
                lista.removeLast()
            }
            return mayorDeUnaLista(lista)
        }
    }

/**
 * Una clase auxiliar
 */
data class Punto(val x: Int, val y: Int) {
    fun distanciaAlOrigen(): Double = sqrt(x.toDouble().pow(2) + y.toDouble().pow(2))
}

/**
 * Recursivamente, obtener una lista con aquellos puntos que están en el origen o
 * que hacen parte del primer cuadrante.
 */
fun puntosPrimerCuadrante(puntos: IList<Punto>): IList<Punto> {
    when{
        puntos.size==0 -> return TList()
        else-> {
            var prim=puntos.first
            val resto:IList<Punto> = puntos.tail()
            if(prim.x>=0 && prim.y>=0){
                var lista= puntosPrimerCuadrante(resto)
                lista.add(prim)
                return lista
            }else{
                return puntosPrimerCuadrante(resto)
            }
        }
    }
}

/**
 * Recursivamente, obtiene el punto que está más lejano del origen.
 * Si la lista esta vacía, retorne null
 * Si la lista tiene un solo elemento, retorne ese elemento
 * si la lista tiene más de un elemento, tome el primer elemento y
 * compárelo con el punto más lejano del resto de la lista.
 */
fun puntoMasLejano(puntos: IList<Punto>): Punto? {
    fun puntoMasLejano(puntos: IList<Punto>): Punto? {
        if(puntos.isEmpty){
            return null
        }
        else if(puntos.size==1){
            return puntos.first
        }
        else{
            val ultimo = puntos.last
            val penultimo = puntos.get(puntos.size-2)
            if(ultimo.distanciaAlOrigen()>penultimo.distanciaAlOrigen()){
                puntos.remove(puntos.size-2)
            }
            else{
                puntos.removeLast()
            }
            return puntoMasLejano(puntos)
        }
    }
}
