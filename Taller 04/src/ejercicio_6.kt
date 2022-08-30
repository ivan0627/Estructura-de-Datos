
fun calcularMasa(peso:Double,altura:Double)=peso/Math.pow(altura,2.0)
fun main (){
    print("Digite el numero de empleados: ")
    var n = readLine()!!.toInt()
    var nombrePesoMaximo=""
    var pesoMaximo=0.0
    var alturaMaxima=0.0
    var imcMaximo=0.0
    for (i in 1..n){
        print("Digite el nombre del empleado #$i: ")
        var nombre= readLine()!!.toString()
        print("Digite el peso en Kg de '$nombre': ")
        var peso= readLine()!!.toDouble()
        print("Digite la altura en metros de '$nombre': ")
        var altura= readLine()!!.toDouble()
        var imc= calcularMasa(peso,altura)
        println("El IMC del empleado '$nombre' es de $imc")
        if(imc>imcMaximo){
            pesoMaximo=peso
            nombrePesoMaximo=nombre
            alturaMaxima=altura
        }

    }
    println("El empleado mas obeso es '$nombrePesoMaximo' cuyo peso es $pesoMaximo Kg y su altura es de $alturaMaxima m ")
}