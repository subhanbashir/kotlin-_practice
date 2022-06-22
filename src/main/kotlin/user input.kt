import java.util.*

fun main(){
    println("enter your name")
    val name: String= readLine()!!
    println("you enter $name ")
    println("**************")

    // Creates an instance which takes input from standard input (keyboard)

    val reader_1 = Scanner(System.`in`)
    print("Enter a name: ")
    var name_1 : String = reader_1.next()
    println("your name is $name_1")

    println("********************************")

    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    println("You entered: $integer")


}
