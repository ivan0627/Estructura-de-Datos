package solucion_taller2
/*Todo punto del eje cartesiano está descrito por dos elementos: la
coordenada x (o «abscisa») y su coordenada y (que también se llama la
«ordenada»). Suponga que tenemos las coordenadas (x, y) de dos
puntos: x1 y y1 para el primer punto, y también x2y y2 para el segundo
punto. Vamos a construir funciones y un programa que nos ayude a resolver los siguientes interrogantes:

Escriba una función que halle la distancia entre dos puntos de
acuerdo a la siguiente fórmula:
d=(y2−y1)2+(x2−x1)2

o Escriba una función que reciba las coordenadas de dos puntos
y que retorne la pendiente de la recta que une esos dos
puntos. Recordemos qu e la pendiente se obtiene con la
fórmula:
m=y2−y1x2−x1

o Escriba una función que reciba las coordenadas de dos puntos
y que retorne las coordenadas del punto medio que se
encuentra entre ellos. Las dos coordenadas se hallan a partir de
la siguiente fórmula:
xm=x1+x22
ym=y1+y22

o Ahora escriba un programa que lea las dos coordenadas de dos
puntos, y que imprima, usando las funciones anteriores, la
distancia entre esos puntos, la pendiente de la recta que une
esos dos puntos y el punto medio.

 */
fun obtenerDistancia(x1:Double,x2:Double,y1:Double,y2:Double)=Math.sqrt(Math.pow((y2-y1),2.0)+Math.pow((x2-x1),2.0)) //como realmente se obtiene la hipotenusa
//fun obtenerPendiente(x1:Double,x2:Double,y1:Double,y2:Double)=y2-y1*x2-x1//Segun requerimiento
fun obtenerPendiente(x1:Double,x2:Double,y1:Double,y2:Double)=(y2-y1)/(x2-x1)//como realmente se obtiene la pendiente

fun obtenerPuntoMedio(x1:Double,x2:Double,y1:Double,y2:Double):Pair<Double,Double>{
    var xm= (x1+x2)/2
    var ym=(y1+y2)/2
    return Pair(xm,ym)
}
fun main(){
    print("Digite de la coordenada P1[x1,y1] el valor x1: ")
    var x1= readLine()!!.toDouble()
    print("Digite de la coordenada P1[x1,y1] el valor y1: ")
    var y1= readLine()!!.toDouble()
    print("Digite de la coordenada P2[x2,y2] el valor x2: ")
    var x2= readLine()!!.toDouble()
    print("Digite de la coordenada P2[x2,y2] el valor y2: ")
    var y2= readLine()!!.toDouble()
    var d=obtenerDistancia(x1, x2, y1, y2)
    var m= obtenerPendiente(x1, x2, y1, y2)
    var (xm,ym)= obtenerPuntoMedio(x1, x2, y1, y2)
    println("La distancia entre los puntos dados es de ${d}")
    println("La pendiente de la recta es de ${m}")
    println("El punto medio de la recta se encuentra en las coordenadas  [${xm},${ym}]")
}