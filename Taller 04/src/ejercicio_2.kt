
fun main() {
        print("Digite la cantidad de estudiantes: ")
        var n= readLine()!!.toInt()
        var (alturaMayor,estudianteMayor)=Pair(0,0)
        for (i  in 1..n){
            print ("Digite el alto en cm del estudiante #$i: ")
            var entrada= readLine()!!.toInt()
            if(entrada>alturaMayor){
                alturaMayor=entrada
                estudianteMayor=i
            }
        }
        println("El estudiante #$estudianteMayor es el mas alto con una altura de $alturaMayor cm")
    }
