package explore

fun main(args: Array<String>) {
    var person = Person()
    person.name = "Ekta Kadri"
    println("The person's name is : $person.display()");
    println("The person's name is : ${person.returnString()}");
    println("The person's name is : ${person.display()}");
}

class Person {
    var name :String = ""
    fun returnString():String {
        return name; //comment inline
    }

    fun display() {

    }
}