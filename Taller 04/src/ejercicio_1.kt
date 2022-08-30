

fun main() {

    var n=0
    println("Por favor digite la candidad de estudiantes: ")
    n = readLine()!!.toInt()

    var aprobados = 0
    var reprobados = 0
    var igualDiez =0
    var igualCien = 0
    var sumatoria = 0.0

    for (i in 1 .. n) {
        print("Digite la nota del primer parcial: ")
        var primerNota = readLine()!!.toDouble()
        print("Digite la nota del segundo parcial: ")
        var segundaNota = readLine()!!.toDouble()
        print("Digite la nota del parcial final: ")
        var tercerNota = readLine()!!.toDouble()

        var notaFinal = primerNota*0.25+segundaNota*0.25+tercerNota*0.5
        println("Su nota final es: $notaFinal")
        sumatoria += notaFinal

        when {
            notaFinal>=60 -> aprobados++
            notaFinal<60 -> reprobados++
            notaFinal==10.0 -> igualDiez++
            notaFinal==100.0 -> igualCien++
        }
    }

    var promedio=sumatoria/n
    println("Aprobados $aprobados," +
            " Reprobados $reprobados," +
            " Nota igual a 10: $igualDiez," +
            " Nota igual a 100: $igualCien")
    println("El promedio es $promedio")
    }
