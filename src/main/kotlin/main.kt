import kotlin.random.Random

fun main(args: Array<String>) {
    /*
    for (tabla7 in Ejercicio1(10).array){
        println("$tabla7")
    }

     */

    val array = Ejercicio2(10){ Random.nextInt(50,250)}
}