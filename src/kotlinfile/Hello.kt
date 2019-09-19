@file:JvmName("MyKotlin")

package kotlinfile

import javafile.MyJava
import java.math.BigInteger

/*Class not required as kotlin internally created a class during runtime for JVM to execute the program*/
fun main(args: Array<String>) {
    println("The sum of 3 and 5 is ${MyJava.add(3, 5)}")
    println(findVolume(breadth = 5, height = 5, length = 2)) //Named parameters - can't be used in java
    println(findVolume(breadth = 5, length = 2)) //Named parameters
    println(4.isGreaterThan(2))
    println(fibonacciSeries(50000, BigInteger("1"), BigInteger("0")))
}

fun maxVal(a: Int, b: Int): Int = if (a > b) { // If it is a single line, no need of curly braces
    a // The last line is always returned and must be of the return type of the function
} else {
    b
} //functions as expressions

@JvmOverloads //Default functions with interoperability
fun findVolume(length: Int, breadth: Int, height: Int = 10): Int = length * breadth * height

infix fun Int.isGreaterThan(value: Int): Boolean = this > value//infix function and also extension functions
//All infix functions are extension functions but all extension functions are not infix
//Infix functions must have 1 parameter.

//Tailrec (Tail recursive - to avoid stack overflow crash - It internally executes by not affecting the memory
tailrec fun fibonacciSeries(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0)
        b
    else
        fibonacciSeries(n - 1, a + b, a)
}


