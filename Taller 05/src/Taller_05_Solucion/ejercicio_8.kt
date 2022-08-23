package Taller_05_Solucion

/*
Desarrolle las siguientes funciones y el programa
a. Escriba una función que reciba la base y la altura de un
triángulo y que retorne el área de ese triángulo.
b. Escriba una función que reciba una lista de tripletas (el primer
elemento es el nombre de un triángulo, la base del triángulo y
la altura del triángulo) y que retorne el nombre del triángulo
que posea la mayor área (para encontrar el área DEBE USAR
LA FUNCIÓN ANTERIOR).
c. Escriba una función que reciba una lista de tripletas con la
información de triángulos que habíamos especificado en la
función anterior, y el nombre de un triángulo. La función
deberá retornar el área (Usando la función de área desarrollada
previamente) del triángulo que tiene ese nombre. Si no hay un
triángulo con ese nombre en la lista, deberá retornar -1.0
d. Escriba un programa que lea la siguiente información de N
triángulos: nombre, base y altura, almacene estos datos en
tripletas y las tripletas en una lista, luego usando las dos
funciones anteriores, primero imprima el nombre del triángulo
de mayor área, y luego imprima el área del triángulo con ese
nombre
 */
fun main(){
    print("Digite el numero de triangulos a agregar: ")
    var n= readLine()!!.toInt()
    var list:MutableList<Triple<String,Double,Double>> = mutableListOf()
    var i=1
    repeat(n){
        print("Digite el nombre del triangulo #$i: ")
        var nombre = readLine()!!.toString()
        print("Digite la base del triangulo #$i: ")
        var base = readLine()!!.toDouble()
        print("Digite la altura del triangulo #$i: ")
        var altura = readLine()!!.toDouble()
        list.add(Triple(nombre,base,altura))
        i++
    }
    println("El triangulo ${hallarAreaMayor(list)} es el triangulo con mayor area")
    println("Su area es de ${existeTrianguloArea(list,hallarAreaMayor(list))}")
}

fun areaTriangulo(base:Double,altura:Double)=(base*altura)/2
fun hallarAreaMayor(list:MutableList<Triple<String,Double,Double>>):String{
    var mayor=""
    var areaMayor=0.0
    for((nombre,base,altura) in list){
        var area = areaTriangulo(base,altura)
        if(area>areaMayor){
            areaMayor=area
            mayor=nombre
        }
    }
    return mayor
}
fun existeTrianguloArea(list:MutableList<Triple<String,Double,Double>>,nombreTriangulo:String):Double{
    var area=0.0
    for((nombre,base,altura) in list){

        if(nombre==nombreTriangulo){
            area = areaTriangulo(base,altura)
        }
    }
    if (area==0.0){
        area=-1.0
    }
    return area
}