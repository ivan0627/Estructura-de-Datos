
/*
4. En una empresa se le paga a los trabajadores al final de cada semana de
acuerdo a las reglas dadas a continuación:
o Si trabajas 35 horas o menos, se le paga un valor de 15 mil
pesos la hora;
o Si trabaja más de 35 horas pero menos de 60, se le paga un
valor de 15 mil por las primeras 35 horas y de 18 mil por cada
hora trabajada por encima de las 35
o Si trabaja más de 60 horas, las primeras 35 se pagan a 15 mil
cada una, las siguiente 25 horas a 18 mil cada una y las horas
trabajadas por encima de las 60 horas, se le paga a 25 mil
pesos cada una.
Vamos a buscar imprimir el salario semanal de cada uno de los empleados
de la empresa. Para ello:
o Escriba una función que reciba el número de horas trabajadas
por un empleado y retorne el salario
o Ahora escriba el programa que le pregunte al usuario el
número de empleados que trabajan en la empresa, y para cada
uno de ellos, pregunte el número de horas trabajadas en la
semana, y usando la función anterior, imprima el salario
mensual de ese empleado.

 */

fun pago (horas:Double):Double{
    if (horas <=35){
        return horas*15000
    }
    else if (horas >35 && horas<60 ){
            val horas = horas.toInt()
        var total = 0
            for (i in 36..horas) {
                total++
            }
        return 35*15000+(total.toDouble()*18000)
        }
    else if (horas>60 ){
        val horas = horas.toInt()
        var total = 0
        var total2 = 0
        for (i in 36..60) {
            total++
        }
        for (i in 60..horas) {
            total2++
        }
        return 35*15000+(total.toDouble()*18000)+total2*25000
    }

    else{return (0.0)}

}


fun main() {
    println("Por favor digite el numero de empleados a calcular: ")
    val empleados = readLine()!!.toDouble()
    var empleadosContador = 0
    do{
        println("Por favor digite el numero de horas del empleado ${empleadosContador.toInt()+1}: ")
        val horas = readLine()!!.toDouble()
        println("Su salario semanal corresponde a ${pago(horas)} pesos")
        empleadosContador++
    }
    while(empleadosContador<empleados)

}

