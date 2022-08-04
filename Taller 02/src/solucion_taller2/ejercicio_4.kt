package solucion_taller2
/*
Escriba una función y un programa en Kotlin que resuelva el siguiente
problema: Pedro acabó de recibir el sueldo mensual. Si se gasta el 40% de
ese sueldo en el arriendo y el 15% del sueldo en comida, determine
cuánto dinero se gastó en cada uno de esos dos ítems (en arriendo y en
comida) y cuanto dinero le queda al final.
 */
fun arriendo (s:Float)=s*0.40
fun comida(s:Float)=s*0.15
fun sueldorestante (s:Float)=(s-arriendo(s)- comida(s))
fun main(){
    print("Digite el salario de Pedro: ")
    var s= readLine()!!.toFloat()
    println("Pedro se gasta $${arriendo(s)} en arriendo y $${comida(s)} en comida")
    var sr= sueldorestante(s)
    println("El sueldo que queda es de $${sr}")
}