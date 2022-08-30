
fun main(){
    var menorPoblacion=999999999
    var nombreMunicipio=""
    var i=1
    print("Digite nombre del municipio número #$i: ")
    var municipio= readLine()!!.toString()
    print("Digite su el departamento al que pertenece $municipio: ")
    var departamento= readLine()!!.toInt()
    print("Digite la población de $municipio: ")
    var poblacion= readLine()!!.toInt()
    while (poblacion>0 || municipio!=""){
        if(poblacion<menorPoblacion){
            menorPoblacion=poblacion
            nombreMunicipio=municipio
        }
        i++
        print("Digite nombre del municipio número #$i: ")
        municipio= readLine()!!.toString()
        print("Digite su el departamento al que pertenece $municipio: ")
        departamento= readLine()!!.toInt()
        print("Digite la población de $municipio: ")
        poblacion= readLine()!!.toInt()
    }
    println("$nombreMunicipio es el municipio con menor población el cual pertenece al departamento $departamento, población: $menorPoblacion")
}