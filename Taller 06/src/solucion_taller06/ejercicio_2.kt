package solucion_taller06

class ascensor {
    private var pisos : Int =0
    private var sotanos : Int =0
    private var pisoActual : Int = 0
    constructor()
    constructor(pisos: Int, sotanos: Int, pisoActual: Int) {
        this.pisos = pisos
        this.sotanos = sotanos
        this.pisoActual = pisoActual
    }
    fun getpisos()=this.pisos
    fun getsotanos()=this.sotanos
    fun getpisoActual()= this.pisoActual
    //modificadores set
    fun setpisos(nuevo_pisos:Int) {
        if (nuevo_pisos!=0){
            this.pisos=nuevo_pisos
        }
    }
    fun setsotanos(nuevo_sotanos:Int){
        if(nuevo_sotanos!=0){
            this.sotanos=nuevo_sotanos
        }
    }
    fun setpisoActual(nuevo_pisoActual:Int){
        if (nuevo_pisoActual !=0){
            this.pisoActual = nuevo_pisoActual
        }
    }

    fun subirUnPiso () :Int{
        if (pisoActual>=sotanos &&pisoActual<pisos && pisoActual!=0 &&pisoActual!=-1) {
            pisoActual += 1
             return pisoActual
        }
        print(pisoActual)
        if (pisoActual == -1){
            pisoActual += 2
        return pisoActual}
        else {return 0}
    }
    fun bajarUnPiso ():Int{
        if (pisoActual<=pisos){
            if (pisoActual>sotanos &&pisoActual<=pisos && pisoActual!=0 &&pisoActual!=1) {
                pisoActual-=1
            return pisoActual}
            if (pisoActual == 1){pisoActual-=2
            return pisoActual}
            else{return 0}
        }
        else{return 0}

    }

}

fun main() {
    var x = ascensor()
    var opc:Int
    do {
        println("0.salir\n1.Crear el ascensor\n2.imprimir detalles\n3.Subir un piso\n4.Bajar un piso \n" +
                "5.Numero de pisos para atender\n6.Saber piso actual")
        print("Escoja una opcion: ")
        opc = readLine()!!.toInt()
        when (opc){
            1-> {
                print("Inserte el numero de pisos: ")
                val entradaPisos = readLine()!!.toInt()
                print("Ingrese el numero de sotanos en numero positivo: ")
                val entradaSotanos = readLine()!!.toInt()*-1
                print("Ingrese el piso actual: ")
                val entradaPisoActual = readLine()!!.toInt()
                x = ascensor(entradaPisos, entradaSotanos,entradaPisoActual)

            }
            2-> {

                println("La cantidad de pisos es ${x.getpisos()} y la cantidad de sotanos es ${x.getsotanos()*-1}")
            }
            3-> {
                println("El ascensor ha subido un piso, ahora esta en el piso ${x.subirUnPiso()}")
            }
            4-> {
                println("El ascensor ha bajado un piso, ahora esta en el piso ${x.bajarUnPiso()}")
            }
            5-> {
                println("El total de pisos que puede atender el ascensor son: ${x.getsotanos()*-1+x.getpisos()}")
            }
            6-> {
                println("El piso actual es: ${x.getpisoActual()}")
            }
        }
    }while (opc!=0)
}