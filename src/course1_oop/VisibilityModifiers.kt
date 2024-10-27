package course1_oop

// Public : default
internal class Animal3 {
    var name = "Default Animal" // default visibility
    private var age = 10; // private visibility

    private fun run() {
        println("$name can run")
    }
}

fun main() {
    val cat = Animal3();
    println(cat.name)
//    cat.run();
//    println(cat.age)

}


