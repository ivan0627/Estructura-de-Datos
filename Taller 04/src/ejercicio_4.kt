
fun distancia (latitud : Double, longitud:Double):Double=latitud+longitud

fun main() {
    println("Digite el nombre de la ciudad: ")
    var nombre= readLine()!!
    println("Digite la latitud de la ciudad: ")
    var latitud = readLine()!!.toDouble()
    println("Digite la longitud de la ciudad: ")
    var longitud = readLine()!!.toDouble()
    var ciudadMasLejana = ""
    var distanciaMasLejana = 0.0
    while (nombre != ""){
        println("Digite el nombre de la ciudad: ")
         nombre= readLine()!!
        println("Digite la latitud de la ciudad: ")
         latitud = readLine()!!.toDouble()
        println("Digite la longitud de la ciudad: ")
         longitud = readLine()!!.toDouble()
        var distanciaCiudad = distancia(latitud, longitud)
        if (distanciaCiudad >distanciaMasLejana){
            ciudadMasLejana = nombre
            distanciaMasLejana = distanciaCiudad
        }
    }
    println("La ciudad mas lejana es: $ciudadMasLejana con distancia de: $distanciaMasLejana")
}