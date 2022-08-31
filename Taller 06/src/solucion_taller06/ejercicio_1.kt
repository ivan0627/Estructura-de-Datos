package solucion_taller06

import kotlin.math.PI
import kotlin.math.sqrt

class Pendulo{
    private var l:Double=0.0
    private var a:Double=0.0
    constructor() //primario
    constructor(l:Double, a:Double){
        this.l=l
        this.a=a
    }
    //analizadoras get
    fun getlongitud()=this.l
    fun getaceleracion()=this.a
    //modificadores set
    fun setl(nuevo:Double) {
        if (nuevo!=0.0){
            this.l=nuevo
        }
    }
    fun seta(nuevo_a:Double){
        if(nuevo_a!=0.0){
            this.a=nuevo_a
        }
    }

    //metodos
    fun periodo_oscilacion()= 2* PI * sqrt(this.a/this.l)


}

data class Pendulo2(
    public var l:Double=0.0,
    public var a:Double=0.0
){
    fun periodo_oscilacion()= 2* PI * sqrt(this.a/this.l)
}

fun main() {
    var x = Pendulo()
    var opc:Int
    do {
        println("0.salir\n1.Crear el pendulo\n2.imprimir\n3.Calcular el periodo de oscilacion")
        print("Escoja una opcion")
        opc = readLine()!!.toInt()
        when (opc){
            1-> {
                print("Longitud: ")
                val longitud = readLine()!!.toDouble()
                print("Aceleracion: ")
                val aceleracion = readLine()!!.toDouble()
                x = Pendulo(longitud, aceleracion)

            }
            2-> {

                println("La longitud es de ${x.getlongitud()} y la acelaracion es de ${x.getaceleracion()}")
            }
            3-> {
                println("El periodo de aceleracion: ${x.periodo_oscilacion()}")
            }
        }
    }while (opc!=0)
}