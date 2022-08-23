package Taller_05_Solucion

/*
Desarrolle la siguiente función y programa

a. Escriba una función que reciba una lista con los nombres de las
ciudades del país, y el nombre de una ciudad, y que retorne si
esa ciudad existe en la lista o no. Debe usar un for o
un while para resolver este problema.

b. Escriba un programa que lea el nombre de varias ciudades
(para finalizar, suponga que el nombre es vacío) y las almacene
en una lista. Luego, lea el nombre de una ciudad, y USANDO la
función anterior, indique si esa ciudad existe en la lista.
 */


fun existeCiudad(lista:MutableList<String>,ciudad:String):String{
    var mensaje=""
    for(ciudadLista in lista){
        if(ciudad==ciudadLista){
            mensaje="La ciudad $ciudad existe en la lista"
        }
    }
    if(mensaje==""){
        mensaje="La ciudad $ciudad no existe en la lista"
    }
    return mensaje
}
fun main(){
    var lista:MutableList<String> = mutableListOf()
    print("Digite el nombre de la ciudad para la lista: ")
    var ciudadlista = readLine()!!.toString()
    while(ciudadlista!=""){
        lista.add(ciudadlista)
        print("Digite el nombre de la ciudad para la lista: ")
        ciudadlista = readLine()!!.toString()
    }
    print("Digite el nombre de la ciudad a validar en la lista: ")
    var ciudad= readLine()!!.toString()
    print("${existeCiudad(lista,ciudad)}")
}
