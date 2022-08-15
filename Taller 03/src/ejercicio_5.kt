/*
Escriba un programa en Kotlin que halle la sumatoria de los
primeros 𝑛 números enteros positivos; el valor de 𝑛 debe ser solicitado al
usuario y se desea que el programa visualice en cada iteración el número
y la sumatoria parcial hasta ese momento.
∑i=1ni=1+2+3+⋯+n

 */
fun main() {
    println("Por favor digite el valor de n para ∑i=1ni=1+2+3+⋯+n")
    var n = readLine()!!.toInt()
    var resultado = 0
    for (i in 1..n){
        resultado = resultado+i
        println("${resultado-i} + $i = $resultado")
    }

}
