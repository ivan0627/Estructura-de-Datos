package solucion_taller2
/*
Vamos a hacer un programa que transforme un número entero a
números romanos. Por ahora solo vamos a considerar números entre 1 y
99. Para ello desarrolle las siguientes funciones y el programa:

1. Escriba una función que descomponga un número entero de
dos cifras en sus dos dígitos, es decir, la función retorna las
decenas y las unidades del número original.

2. Escriba otra función que reciba un número entero de un dígito
(es decir, entre 0 y 9) y retorne el equivalente en romano de
ese digito. O sea, para 1 retorne "I", para 2 debe retornar "II" y
así sucesivamente. Para el cero retorne una cadena o string
vacío, ""

3. Escriba finalmente una función que reciba un número entero
de un dígito, es decir, un número entre 0 y 9, y retorne el
equivalente romano en decenas de ese número. Las decenas en
romano son: para el 1, es una "X", para el 2, es "XX", para el 3,
es "XXX", para el 4 es "XL", para el 5 es "L", y así
sucesivamente.

4. Ahora si, escriba un programa que lea un número entero, y si el
número tiene menos de 3 cifras, utilice las funciones anteriores,
para convertir el número a romanos (es decir, obtenga las
decenas y unidades del número, convierta las unidades a
romano, convierta las decenas a romano, e imprima ambos
string en pantalla). Si el número tiene 3 o más dígitos o es
negativo, se debe mostrar un mensaje de error
 */

fun descomposicion (a:Int):Pair<Int, Int> {
    var decimal =(a%10).toInt()
    var decena = (a/10).toInt()
     return Pair(decena, decimal)
}

fun numeroRomano (a:Int):String {
  var romano =  when (a){
        1->"I"
        2->"II"
        3->"III"
        4->"IV"
        5->"V"
        6->"VI"
        7->"VII"
        8->"VIII"
        9->"IX"
        else  -> "Entrada no valida"
    }
    return romano.toString()
}

fun numeroRomanoDecena (a:Int) :String {
    var romano=
        when (a) {
    1->"X"
    2->"XX"
    3->"XXX"
    4->"XL"
    5->"L"
    6->"LX"
    7->"LXX"
    8->"LXXX"
    9->"XC"

    else -> "Entrada no valida"
}
   return romano.toString()
}


fun main() {
    println("Por favor digite el numero entero: ")
    var entrada = readLine()!!.toInt()

    fun proceso(a: Int):Pair<String, String>{
       val intDecena = descomposicion(a).first
       val romanoDecena = numeroRomanoDecena(intDecena)
        println(romanoDecena)
        val decimal = descomposicion(a).second
        val romanoDecimal = numeroRomano(decimal)
        return Pair(romanoDecena, romanoDecimal)
    }

        if (entrada <=0 || entrada >=100){ println("Entrada no valida")}
    else {
        println("El numero $entrada en romano es: " + proceso(entrada))}

}