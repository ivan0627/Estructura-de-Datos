/*
Se realizó una investigación en algunas discotecas y sitios de diversión de
la ciudad para determinar el consumo de licor entre las personas
encuestadas; se preguntó a cada uno de los encuestados lo siguiente:
1. Consume licor (Si o No)
2. Licor prefereido (1- Aguardiante, 2-Ron, 3-Cerveza, 4-Tequila,
5-Whisky, 6-Otro)
3. Edad
4. Sexo
Desarrollar un programa en Kotlin que procese dicha información y
obtenga los siguiente resultados:
o Total de personas encuestadas que consumen licor.
o Total de mujeres menores de edad
 Total de hombres que no consumen aguardiente y que tienen
entre 20 y 25 años de edad.
o Promedio de edad de las personas que consumen cerveza.
o Porcentaje de personas que consumen whisky en relación con
el total encuestado.
 */

fun main() {
    println("Por favor digite la cantidad de personas a encuestar: ")
    var n = readLine()!!.toInt()
    //Total de personas encuestadas que consumen licor
    var personasLicor= 0
    var mujeres = 0
    var hombres = 0
    //Total de mujeres menores de edad
    var mujeresMenores = 0
    //Total de hombres que no consumen aguardiente y que tienen entre 20 y 25 años de edad.
    var hombresAguardiente = 0

    //Promedio de edad de las personas que consumen cerveza.
    var personasCerveza = 0
    var edadPersonasCerveza = 0

    //Porcentaje de personas que consumen whisky en relación con el total encuestado.
      var personasWhiskey = 0


    for (i in 1..n){
        println("Digite su edad: ")
        var edad = readLine()!!.toInt()
        println("Digite su genero: ")
        var genero = readLine()!!.toUpperCase()
        if (genero == "HOMBRE")  {hombres++}
        if (genero == "MUJER") { mujeres++}

        if (genero == "MUJER" && edad in 1 .. 17 ){
            mujeresMenores++
        }
        println("¿Consume licor? digite Si o No")
        var consumeLicor = readLine()!!.toUpperCase()

        if (consumeLicor == "SI"){
            personasLicor ++
            println("De los siguientes licores: 1- Aguardiante, 2-Ron, 3-Cerveza, 4-Tequila, 5-Whisky, 6-Otro")
            println("¿Cual es de su preferencia? Digite el numero: ")
            var licor = readLine()!!.toInt()

            if (genero == "HOMBRE" && edad in 20..25 && licor !=1){
                hombresAguardiente++
            }
            if (licor == 3){
                edadPersonasCerveza = edadPersonasCerveza+edad
                personasCerveza ++
            }
            if (licor == 5){
                personasWhiskey ++
            }
        }
        }
    var promedioPersonasCerveza = edadPersonasCerveza / personasCerveza
    var porcentajeWhiskey = personasWhiskey * 100 /n

    println("El total de personas encuestadas que consume licor es: $personasLicor")
    println("El total de mujeres menores de edad es: $mujeresMenores")
    println("El total de hombres que no consumen aguardiente y que tienen entre 20 y 25 años es: $hombresAguardiente")
    println("El promedio de edades de personas que consumen cerveza es $promedioPersonasCerveza")
    println("El porcentaje de personas que consumen Whiskey en relacion con el total encuestado es: $porcentajeWhiskey")

    }




