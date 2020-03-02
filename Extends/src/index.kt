open class Person(open val firstName: String, val lastName: String, var age: Int?) {
    private var fullName = "$firstName $lastName"

    // initializer block
    init {
        println("Initialized with first name: ${firstName}, last name: ${lastName}, age: $age")
    }

    open fun talk(message: String = "") {
        println("$firstName $lastName say $message")
    }
}

class Engineer(var fieldOfStudy: String, firstName: String, lastName: String, age: Int?) :
    Person(firstName, lastName, age) {
    override val firstName = super.firstName.toUpperCase()
    override fun talk(message: String) {
        super.talk(message)
        println("I'm an engineer")
    }
}

fun main(args: Array<String>) {
    var engineer: Engineer = Engineer("mechanics", "Alan", "Turing", 20)
    println("Details: First name = ${engineer.firstName} - last name = ${engineer.lastName} - age = ${engineer.age} - field of study = ${engineer.fieldOfStudy}")
    engineer.talk("Good morning")
}