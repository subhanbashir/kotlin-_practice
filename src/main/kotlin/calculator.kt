import java.util.*
fun main(){
    val obj= calculator()
    val input_1=Scanner(System.`in`)
    println("enter the value of a")
    val a=input_1.nextDouble()
    println("enter the value of b")
    val b=input_1.nextDouble()


    println(obj.sum(a.toDouble(), b.toDouble()))
    println(obj.divide(a.toDouble(), b.toDouble()))



}
class calculator(){
    fun sum(a: Double, b:Double): Unit =println("a + b = ${a+b}")
    fun negative(a:Double, b:Double): Double= a-b
    fun multiply(a:Double,b:Double): Double= a*b
    fun divide(a:Double, b: Double): Unit = println("a / b = ${a/b}")

}