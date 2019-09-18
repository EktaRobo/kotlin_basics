import explore.Person
import java.util.function.Consumer

/*Class not required as kotlin internally created a class during runtime for JVM to execute the program*/
fun main(args: Array<String>) {
    var a = 5
    var b = 3

    //If as expression
    var maxVal = if (a > b) {
        println("The max value is $a")
        a
    } else {
        println("The max value is $b")
        b
    }

    println(maxVal)

    when (maxVal) { //Substitute for switch case
        in 1..10 -> println("The max value is in between 1 and 10")
        10 -> println("The max value is 10")
        a -> println("The max value is a: $a")
        b -> println("The max value is b: $b")
        else -> {
            println("I don't know what x is")
        }
    }

    var maxValString = when (maxVal) { //when as expression
        a -> "The max value is a: $a"
        b -> "The max value is b: $b"
        else -> "I don't know what x is"
    }

    println(maxValString)
}

