package solucion_taller2
/*
En el nuevo edificio de la universidad, cada piso tendrá el mismo número
de salones y en todos los salones tendrán la misma capacidad (cantidad
de estudiantes que caben en el salón). Escriba una función y un programa
que calcule el número de salones y el número de pisos que tendrá el
nuevo edificio a partir del número de estudiantes que tiene la
universidad, la capacidad del salón y el número de salones que tendrá un
piso del edificio.
 */
fun main(){
    print("Digite el numero de estudiantes: ")
    var ne= readLine()!!.toInt()
    print("Digite la capacidad del salon: ")
    var cs= readLine()!!.toInt()
    print("Digite el numero de salones por piso: ")
    var sp= readLine()!!.toInt()
    var (np,ns,st)= calculo(ne,cs,sp)

    println("Se necesitan ${ns} salones para ${ne} estudiantes ")
    println("Ya que por piso son ${sp} salones, se debe construir ${np} pisos con un total de ${st} salones ")
}
fun calculo(ne:Int,cs:Int,sp:Int): Triple<Int,Int,Int>{
    var ns = Math.ceil((ne.toDouble()/cs))
    var np= Math.ceil(ns/sp)
    var st = np*sp
    return Triple(np.toInt(), ns.toInt(),st.toInt())
}

