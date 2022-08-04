package solucion_taller2

fun main() {
    val edades = mutableListOf(99)

    println("Por favor digite la edad de Andres: ")
    var edadPrimeraPersona = readln().toInt()!!
    edades.add(edadPrimeraPersona)


    println("Por favor digite la edad de Carlos: ")
    var edadSegundaPersona = readln().toInt()!!
    edades.add(edadSegundaPersona)

    println("Por favor digite la edad de Maria: ")
    var edadTerceraPersona = readln().toInt()!!
    edades.add(edadTerceraPersona)

    var edadMinima = edades.max()

    if (edadPrimeraPersona < edadSegundaPersona && edadPrimeraPersona < edadTerceraPersona) {
        println("La edad maxima es: $edadMinima de Andres")
    }
    if (edadSegundaPersona < edadPrimeraPersona && edadSegundaPersona < edadTerceraPersona) {
        println("La edad maxima es: $edadMinima de Carlos")
    }
    if (edadTerceraPersona < edadSegundaPersona && edadTerceraPersona < edadPrimeraPersona) {
        println("La edad maxima es: $edadMinima de Maria")
    }

    if (edadPrimeraPersona == edadSegundaPersona || edadPrimeraPersona == edadTerceraPersona || edadSegundaPersona == edadTerceraPersona) {

        println("Hay dos o mas edades iguales, no se encontró una sola edad maxima")
    }

}