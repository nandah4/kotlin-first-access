package course1_oop

class Animal4 (val name : String, val age : Int) {

    // Method overloading
    fun eat() {
        println("$name makan!")
    }
    fun eat(typeFood : String) {
        println("$name memakan $typeFood")
    }
    fun eat(typeFood: String, weightFood: Double) {
        println("$name memakan $typeFood dengan berat $weightFood")
    }
}

class Calculator {
    fun add(numberA: Int, numberB : Int) = numberA + numberB;
}

fun main() {
    val calc = Calculator()
    println(calc.add(1, 23))

    val cat = Animal4("Kucing", 4)
    cat.eat()
    cat.eat("Ikan Tuna")
    cat.eat("Ikan Tuna", 2.3)
}
