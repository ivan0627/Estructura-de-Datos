package universidadean.programacionfuncional

import ean.collections.IList
import java.lang.Math.pow

import kotlin.math.sqrt

// Esta clase guarda la información de un producto de una tienda
data class Producto(val codigo: Int, val nombre: String, val cantidad: Int, val precio: Int)

// Esta clase guarda la información de un departamento del país
data class Departamento(
    val nombre: String,
    val poblacion: Int,
    val superficie: Double,
    val densidad: Double,
    val IDH: Double,
    val añoCreacion: Int)

// Esta clase guarda la información de un municipio del pais
data class Municipio(
    val codigo: Int,
    val nombre: String,
    val departamento: String,
    val poblacionUrbana: Int,
    val poblacionRural: Int,
    val esCapital: Boolean
)

// Esta clase guarda la información de un rectángulo
data class Rectangulo(val base: Double, var altura: Double) {
    // Hallar el área del rectangulo
    fun area(): Double = base * altura
}

// Esta clase guarda la información de un triángulo
data class Triangulo(val id: Int,
                     val lado1: Double,
                     val lado2: Double,
                     val lado3: Double)

//-------------------------------------------------------------------
// Operaciones con la clase Departamento
//-------------------------------------------------------------------

/**
 * Obtener el nombre del departamento más antiguo de toda la lista.
 * Si la lista está vacía, retorne null
 */
fun metodo6(dptos: IList<Departamento>): String? {
    if(dptos.isEmpty){
        return null
    }else{
        var antiguo=dptos.minWith(compareBy(Departamento::añoCreacion))
        return antiguo!!.nombre
    }
}

/**
 * Retorna el  departamento que tiene la superficie más grande
 * pero con una población superior a la población que se pasa
 * como parámetro.
 */
fun metodo7(dptos: IList<Departamento>, poblacion: Int): Departamento? {
    if(dptos.isEmpty){
        return null
    }else{
        var poblacion=dptos.filter{
            it.poblacion>poblacion
        }
        var mayor=poblacion.maxWith(compareBy(Departamento::superficie))
        return mayor
    }
}

/**
 * Retorne la lista de los nombres de los departamentos creados
 * en el siglo XX y que tenga un IDH entre 0.85 y 0.95
 */
fun metodo8(dptos: IList<Departamento>): IList<String> {
    val creados=dptos.filter{
        it.añoCreacion>=1901 && it.añoCreacion<=2000 &&
                it.IDH>=0.85 && it.IDH<=0.95
    }
    return creados.map {
        it.nombre
    }
}

/**
 * Retorne el porcentaje de departamentos de la lista cuya densidad
 * esté por debajo del valor que se pasa como parámetro
 */
fun metodo9(deptos: IList<Departamento>, valor: Double): Double {
    var contador=deptos.count()
    var porcentaje=deptos.count{it.densidad<valor}
    return porcentaje.toDouble()*100/contador.toDouble()
}

/**
 * Retorne el promedio de superficie de los departamentos de la lista
 * cuya poblacion sea superior a la población del departamento con menor
 * IDH de toda la lista
 */
fun metodo10(deptos: IList<Departamento>): Double {
    val menoridh=deptos.minWith(compareBy(Departamento::IDH))
    val filtro=deptos.filter {
        it.poblacion>menoridh!!.poblacion
    }
    val contador=filtro.count() //filtro.size
    val promedio=filtro.sumByDouble { it.superficie } //filtro.map{it.superficie}.sum()
    return promedio/contador
}

//-------------------------------------------------------------------
// Operaciones con la clase Municipio
//-------------------------------------------------------------------

/**
 * Determinar y retornar cuántos municipios de la lista son capitales
 */
fun metodo11(muns: IList<Municipio>): Int {
    val mun= muns.filter{
        it.esCapital==true
    }
    return mun.count()
}

/*
 * Determinar el nombre del municipio que no es capital y que pertenece al
 * departamento que se recibe como parámetro y que tiene la población urbana
 * más grande
 */
fun metodo12(m: IList<Municipio>, depto: String): String {

    val mun= m.filter{
        it.esCapital==false && it.departamento==depto
    }
    val municipio=mun.maxWith(compareBy(Municipio::poblacionUrbana))
    return municipio!!.nombre
}

/**
 * Retornar el promedio de la población total (suma de la población rural y población urbana)
 * de aquellos municipios de la lista que pertenecen al departamento que se pasa
 * como parámetro y cuyo código sea múltiplo de 3 o de 5
 */
fun metodo13(municipios: IList<Municipio>, departamento: String): Double {
    val mun= municipios.filter{
        it.departamento==departamento && (it.codigo%3==0 || it.codigo%5==0)
    }
    val total=mun.count()
    val poblacion=mun.sumBy { it.poblacionRural + it.poblacionUrbana }
    return poblacion/total.toDouble()
}

/**
 * Retorne el nombre del primer municipio que inicia con J en toda la lista
 */
fun metodo14(muns: IList<Municipio>): String {
    val mun=muns.find { it.nombre.startsWith("J") }
    return mun!!.nombre
}


/**
 * Retorne cuantos municipios de la lista que tienen un código
 * de 4 dígitos poseen una poblacion rural superior a la población
 * urbana
 */
fun metodo15(muns: IList<Municipio>): Int {
    val mun=muns.filter {
        it.poblacionRural>it.poblacionUrbana
                && it.codigo>=1000 && it.codigo<=9999
    }
    return mun.size
}

//-------------------------------------------------------------------
// Operaciones con la clase Producto
//-------------------------------------------------------------------

/*
 * Obtener el nombre de todos los productos cuyo código es par
 */
fun metodo1(productos: IList<Producto>): IList<String> {
    val prod=productos.filter { it.codigo%2==0 }
    return prod.map{it.nombre}
}

/**
 * Obtener cuántos productos tienen un precio inferior al producto
 * cuyo código se pasa como parámetro
 */
fun metodo2(productos: IList<Producto>, codProducto: Int): Int {
    val product=productos.find { it.codigo==codProducto }
    val prod=productos.filter { it.precio < product!!.precio }
    return prod.count()
}

/**
 * Obtener una lista con los códigos de los productos cuya cantidad sea
 * superior a la cantidad mínima que se pasa como parámetro y cuyo precio
 * esté entre mil y diez mil pesos.
 *
 */
fun metodo3(productos: IList<Producto>, cantidadMinima: Int): IList<Int> {
    val prod=productos.filter { it.cantidad>cantidadMinima && it.precio>=1000 && it.precio<=10000 }
    return prod.map { it.codigo }
}

/**
 * EL inventario total de la lista es la suma de la multiplicación de la cantidad por el precio
 * de todos y cada uno de los productos de la lista. Este método permite saber si el
 * inventario de la lista es superior al millón de pesos o no.
 */
fun metodo4(prods: IList<Producto>): Boolean {

    val prod=prods.sumBy { it.cantidad * it.precio }
    val retorno = prod>1000000
    return retorno
}

/**
 * Obtener el promedio de la cantidad de aquellos productos cuyo precio
 * esté por debajo del promedio de precio de todos los productos de la lista
 */
fun metodo5(prods: IList<Producto>): Double {
    val prod=prods.sumBy { it.precio }
    val totalprod=prods.count()
    val promed=prod/totalprod
    val cant=prods.filter { it.precio<promed }
    val cantidad=cant.sumBy { it.cantidad }
    val totalcant=cant.count()
    return cantidad/totalcant.toDouble()
}

//-------------------------------------------------------------------
// Operaciones con la clase Producto
//-------------------------------------------------------------------

fun metodo16(rects: IList<Rectangulo>): Int {
    /*TODO("¿Cuántos rectángulos de la lista son cuadrados?")*/
    val rec=rects.filter { it.altura ==it.base }
    return rec.count()
}

fun metodo17(rects: IList<Rectangulo>): Double {
    /*TODO("Promedio del área de los rectangulos cuya base es inferior a su altura")*/
    var rec=rects.filter { it.base<it.altura }
    var suma=rec.sumByDouble { it.area() }
    var total=rec.count()
    return suma/total
}

fun metodo18(rects: IList<Rectangulo>): Rectangulo {
    /*TODO("Obtener el rectangulo de mayor área de la lista")*/
    val rec = rects.maxWith(compareBy(Rectangulo::area))
    return rec!!
}

fun metodo19(rects: IList<Rectangulo>, areaMin: Double): IList<Double> {
    /*TODO("Lista con las diagonales de aquellos cuadrados cuya area sea superior al area que se pasa como parámetro")*/
    val rec=rects.filter { it.area()>areaMin }
    return rec.map { Math.sqrt((Math.pow(it.base,2.0)+Math.pow(it.altura,2.0))) }
}

/**
 * Un triangulo es rectangulo si un lado (el mas largo) es igual a la raiz cuadrada de
 * la suma de los cuadrados de los otros dos lados
 */
fun esRectangulo(t: Triangulo): Boolean {
    /*TODO("Retorna true si t es triangulo rectangulo")*/
    return when{
        t.lado1>t.lado2 && t.lado1>t.lado3 -> pow(t.lado1,2.0)== pow(t.lado2,2.0)+pow(t.lado3,2.0)
        t.lado2>t.lado1 && t.lado2>t.lado3 -> pow(t.lado2,2.0)== pow(t.lado1,2.0)+pow(t.lado3,2.0)
        else -> pow(t.lado3,2.0)== pow(t.lado2,2.0)+pow(t.lado1,2.0)
    }
}

fun areaTriangulo(t: Triangulo): Double {
    /*TODO("Hallar el área del triángulo a partir de la fórmula de Herón")*/
    val s=(t.lado1+t.lado2+t.lado3)/2
    val area=Math.sqrt(s*(s-t.lado1)*(s-t.lado2)*(s-t.lado3))
    return area
}



fun metodo20(triangulos: IList<Triangulo>): IList<Double> {
    /*TODO("Lista de áreas de aquellos triangulos rectangulos de la lista")*/
    val t=triangulos.filter { esRectangulo(it) }
    return t.map { areaTriangulo(it) }
}

fun metodo21(triangulos: IList<Triangulo>): IList<Int> {
    fun esIsosceles(t: Triangulo) = t.lado1 == t.lado2 || t.lado2 == t.lado3 || t.lado1 == t.lado3
    //TODO("Obtener la lista de identificadores de aquellos triangulos isosceles cuya área no supere 10")
    return triangulos