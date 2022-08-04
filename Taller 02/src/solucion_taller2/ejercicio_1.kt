package solucion_taller2
/*
Escriba una función en Kotlin y un programa que use esa función, que
encuentre el valor de la siguiente función algebraica:
f(x,y)=x2−2xy+y2

 */
fun operacion(x:Double,y:Double):Double{
    var resultado=Math.pow(x,2.0)-(2*x*y)+Math.pow(y,2.0)
    return  resultado
}
fun main(){
    print("Digite el valor de x: ")
    var x= readLine()!!.toDouble()
    print("Digite el valor de y: ")
    var y= readLine()!!.toDouble()
    print("El resultado de la funcion aplicada es de: ${operacion(x,y)}")
}