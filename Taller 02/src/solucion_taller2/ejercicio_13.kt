package solucion_taller2

/*
La empresa La Generosa S.A desea aumentar el sueldo a sus empleados,
para ello ha establecido las siguientes condiciones: quienes ganan hasta $
800.000 tendrán un incremento del 10%, quienes devengan más de $
800.000 y hasta 1’200.000 recibirán un aumento del 8% y los demás del
5%. Se requiere una función y un programa que calcule el valor del
aumento y el nuevo salario para un empleado.
 */

fun calcularAumento(salarioBase:Double): Pair<Double,Double>{
    var salarioTotal=0.0
    var aumento=0.0
    if(salarioBase>0 && salarioBase <=800000){
        aumento=salarioBase*0.10
        salarioTotal=salarioBase+aumento
    }else if(salarioBase>800000 && salarioBase<=1200000){
        aumento=salarioBase*0.08
        salarioTotal=salarioBase+aumento
    }else{
        aumento=salarioBase*0.05
        salarioTotal=salarioBase+aumento
    }
    return aumento to salarioTotal
}

fun main(){
    print("Digite el salario mensual del empleado: ")
    var sueldo= readLine()!!.toDouble()
    var (aumento,salarioTotal)= calcularAumento(sueldo)
    println("Se realizará aumento de $${aumento} para un salario total de $${salarioTotal}")
}