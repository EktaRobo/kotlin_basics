/*Class not required as kotlin internally created a class during runtime for JVM to execute the program*/
fun main(args: Array<String>) {
    var helloWorld = "Hello World" // Variables assume the datatype of it's first initialization
    var myDecimal = 1.2
    var myInt = 4
    var myString: String //Mutable string
    myString = "Hello Kotlin" // Can declare the type specifically
    myString = "My First Kotlin Program"
    val myConstantString: String //Immutable string
    myConstantString = "This is a constant" //You can specifically declare the type
    val myConstantInt = 34;  // val keyword for constants, can't be re-assigned
    println(myString + "\n" + myDecimal + "\n" + myInt) //comment inline
}