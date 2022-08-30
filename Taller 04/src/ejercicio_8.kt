fun main() {
    var numeros: MutableList<Int> = mutableListOf()
    println("Cuantos numeros va a ingresar")
    val reps = readLine()!!.toInt()
    var i = 0
    var numero:Int
    var max_num :Int
    var min_num :Int
    var cant_impar =0
    var cant_par = 0
    var prom =0


    while (i != reps){
        println("Ingrese el numero ${i+1}")
        numero = readLine()!!.toInt()
        if (numero==0){
            break
        }
        numeros.add(numero)
        i++
    }

    max_num = numeros.max()
    min_num = numeros.min()

    for(i in numeros){
        if (i%2==0){
            cant_par+=1
        }else{
            cant_impar+=1
        }
    }

    for(i in numeros){
        prom +=i
    }
    prom = prom/i

    println("El mayor valor ingresado de la serie = ${max_num}")
    println("El menor valor ingresado de la serie = ${min_num}")
    println("La cantidad de valores impares ingresados = ${cant_impar}")
    println("La cantidad de valores pares ingresados = ${cant_par}")
    println("El promedio de todos los valores ingresados  = ${prom}")
}