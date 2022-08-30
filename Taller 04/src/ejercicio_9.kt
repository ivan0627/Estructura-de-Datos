
fun main(){
    print("Digite la cantidad de estudiantes: ")
    var n = readLine()!!.toInt()
    var nombreAlto=""
    var nombreBajo=""
    var puntajeMaximo=0.0
    var puntajeMinimo=0.0
    var suma=0.0
    var pInferior=0.0
    var pSuperior=0.0
    for (i in 1..n){
        print("Digite el nombre del estudiente #$i: ")
        var nombre= readLine()!!.toString()
        print("Digite el puntaje final del estudiente #$i: ")
        var puntaje= readLine()!!.toDouble()
        if(puntaje>puntajeMaximo){
            puntajeMaximo=puntaje
            nombreAlto=nombre
        }
        if(i==1 || puntaje<puntajeMinimo){
            puntajeMinimo=puntaje
            nombreBajo=nombre
        }
        when{
            puntaje<60 -> pInferior++
            else -> pSuperior++
        }
        suma+=puntaje
    }
    var promedio=suma/n
    //imprime respuestas
    println("$nombreAlto es el estudiante con el puntaje más alto")
    println("$nombreBajo es el estudiante con el puntaje más bajo")
    println("El puntaje maximo es: $puntajeMaximo")
    println("El puntaje minimo es: $puntajeMinimo")
    println("El promedio de los puntajes es de: $promedio")
    println("El ${(pInferior*100)/n}% de los estudiantes tiene un puntaje inferior a 60")
    println("El ${(pSuperior*100)/n}% de los estudiantes tiene un puntaje superior a 60")
}