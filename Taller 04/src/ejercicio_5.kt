
fun calculo(pg:Int,pe:Int)=(pg*3)+(pe*1)
fun main (){
    print("Digite el numero de equipos que hay en la liga: ")
    var n = readLine()!!.toInt()
    var campeon=""
    var pm=0

    for (i in 1..n){
        print("Digite el nombre del equipo #$i: ")
        var nombre= readLine()!!.toString()
        print("Digite cuantos partidos gano el equipo '$nombre': ")
        var pg= readLine()!!.toInt()
        print("Digite cuantos partidos empato el equipo '$nombre': ")
        var pe= readLine()!!.toInt()
        var pt= calculo(pg,pe)
        println("El puntaje del equipo '$nombre' es de $pt")
        if(pt>pm){
            pm=pt
            campeon=nombre
        }

    }

    println("El Campeon es $campeon con $pm puntos")
}