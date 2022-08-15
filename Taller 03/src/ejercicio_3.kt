/*
3. Una empresa ofrece a sus empleados un salario mensual fijo, y un
porcentaje de las ventas como una comisión adicional a ese salario
mensual. Esta comisión se calcula de la siguiente manera: si las ventas de
un empleado excede los 50 mil pesos, la comisión será de un 15% de las
ventas que están por encima de los 50 mil pesos, en otro caso no habrá
comisión.
o Primero, construya una función en la que dado las ventas que
hizo el empleado, determine cuánto es la comisión
o Ahora hay que hacer un programa que calcule y muestre los
salarios y comisiones de todos los empleados de la empresa.
Para cada empleado hay que preguntarle al usuario, el salario
mensual y las ventas realizadas, y mostrar la comisión por las
ventas (usando la función anterior) y el salario neto (salario más
comisión). Como no sabemos cuántos empleados hay, después
de mostrar esta información, debemos preguntarle al usuario si
desea seguir o no.
 */

fun comision (ventas:Double){
    if (ventas >50000){
        println("La comision con respecto a las ventas corresponde a: "+(ventas*15/100).toInt())
    }else {
        println("No hay comision por ventas")}
}

fun main() {

    do {
        println("Por favor digite su usuario: ")
        val usuario = readLine()
        println("Por favor digite su salario: ")
        val salario = readLine()!!.toDouble()
        println("Por favor digite su volumen de venta: ")
        val ventas = readLine()!!.toDouble()

        println("${usuario} basado en sus ventas de ${ventas} su salario total es: "+salario+comision(ventas))

        println("¿Desea continuar con otro calculo? (Si/No): ")
        val pregunta = readLine()!!.toUpperCase()

    }
        while (pregunta=="SI")
}