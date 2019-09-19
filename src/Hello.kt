import explore.Person
import java.util.function.Consumer

/*Class not required as kotlin internally created a class during runtime for JVM to execute the program*/
fun main(args: Array<String>) {
    println("The Max Value among 3 and 5 is ${maxVal(3, 5)}")
}

fun maxVal(a: Int, b: Int): Int = if (a > b) { // If it is a single line, no need of curly braces
    a // The last line is always returned and must be of the return type of the function
} else {
    b
} //functions as expressions

