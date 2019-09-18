package explore

fun main(args: Array<String>) {
    var person = Person()
    person.name = "Ekta Kadri"
    println("The person's name is : $person.display()");
    println("The person's name is : ${person.returnString()}");
    println("The person's name is : ${person.display()}");
    println("The person's name is : ${person.add(2, 6)}");
}

class Person {
    var name: String = ""
    fun returnString(): String {
        return name; //comment inline
    }

    fun display() {

    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }
}