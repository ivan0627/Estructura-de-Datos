package solucion_taller2

import java.lang.Math.pow


fun operar(a:Double,b:Double,o:String): Pair<String,Double>{

    var (nombre,operacion)=when (o){
        "+" -> Pair("Suma",a+b)
        "-" -> Pair("Resta",a-b)
        "/" -> Pair("División",a/b)
        "*" -> Pair("Multiplicación",a*b)
        "%" -> Pair("Módulo",a%b)
        "**" -> Pair("Potenciacíon",pow(a,b))
        else -> Pair("Operación no valida",0.0)
    }

    return nombre to operacion
}
fun main(){
    print("Digite el primer numero: ")
    var a= readLine()!!.toDouble()
    print("Digite el segundo numero: ")
    var b= readLine()!!.toDouble()
    print("Digite el operador: ")
    var o= readLine()!!.toString()
    print("La operación realizada es una '${operar(a,b,o).first}' cuyo resultado es: ${operar(a,b,o).second}")
}