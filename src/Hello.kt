import explore.Person
import java.util.function.Consumer

/*Class not required as kotlin internally created a class during runtime for JVM to execute the program*/
fun main(args: Array<String>) {
    //Loops in Kotlin

    //For
    for (i in 10 downTo 1) {
        print("$i \t")
    }
    println()
    for (i in 1..10) {
        if (i % 2 == 0)
            print("$i \t")
    }
    println()
    //Labelled for loop
    firstFor@ for (i in 1..3) {
        for (j in 1..3) {
            print("$i $j\t\t")
            if (i == 2 && j == 2)
                break@firstFor //Break statement with labelled for loop
        }
    }

    println()
    //Labelled for loop
    firstFor@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2)
                continue@firstFor //Continue statement with labelled for loop
            print("$i $j\t\t")
        }
    }

    println()
    //While
    var i =1
    while (i <= 10) {
        if (i % 2 == 0)
            print("$i \t")
        i++
    }
    println()
    //Do while
    i = 1
    do {
        print("$i \t")
        i++
    } while (i <= 10)



}

