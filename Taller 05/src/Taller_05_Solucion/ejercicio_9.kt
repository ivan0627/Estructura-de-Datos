package Taller_05_Solucion

/*
Desarrolle las siguientes funciones
a. Escriba una función que reciba la coordenada x y la coordenada y de un punto y que retorne
la distancia al origen del punto, el cual se calcula con la siguiente fórmula:
b. Escriba una función que reciba la coordenada x y la coordenada y de un punto
y que retorne el cuadrante (1, 2, 3, 4) del punto o cero si el punto es el origen.
c. Escriba una función que reciba una lista de pares (el primer elemento es la coordenada
x de un punto, y el segundo elemento es la coordenada y del punto), y que retorne el punto
(un par con la coordenada x y la coordenada y), la distancia al origen de ese punto y el cuadrante
del punto que tenga la mayor distancia al origen. Debe usar las dos funciones anteriores.
d. Ahora escriba el programa que lea la coordenada x y la coordenada y de N puntos, guarde
cada coordenada en un par y luego en una lista, y usando la función anterior, muestre el punto,
su distancia al origen y su cuadrante.

 */

fun main(){
    print("Digite el numero de puntos a agregar: ")
    var n= readLine()!!.toInt()
    var list:MutableList<Pair<Double,Double>> = mutableListOf()
    var i=1
    repeat(n){
        print("Digite la coordenada x del punto #$i: ")
        var x = readLine()!!.toDouble()
        print("Digite la coordenada y del punto #$i: ")
        var y = readLine()!!.toDouble()
        var par=Pair(x,y)
        list.add(par)
        i++
    }
    var (punto, distancia, cuadrante)= calcularValores(list)
    var (xi,yi)=punto
    println("El punto con mayor distancia es P($xi,$yi), su distancia desde el punto de origen es $distancia y pertenece al cuadrante $cuadrante")
}
fun calcularDistancia(x:Double,y:Double)=Math.sqrt(Math.pow(x,2.0) + Math.pow(y,2.0))
fun hallarCuadrante (x:Double,y:Double):Int{
    var cuadrante=0
    if(x==0.0 && y==0.0){
        cuadrante=0
    }else if(x>0){
        if(y>0){cuadrante=1}
        else{cuadrante=4}
    }else{
        if(y>0){cuadrante=2}
        else{cuadrante=3}
    }
    return cuadrante
}
fun calcularValores(lista:MutableList<Pair<Double,Double>>):Triple<Pair<Double,Double>,Double,Int>{
    var mayor=0.0
    var puntos= Pair(0.0,0.0)
    var distancia=0.0
    var cuadrante=0
    for ((x,y) in lista){
        if(calcularDistancia(x,y)>mayor){
            puntos=Pair(x,y)
            distancia=calcularDistancia(x,y)
            cuadrante= hallarCuadrante(x,y)
        }
    }
    return Triple(puntos,distancia,cuadrante)
}