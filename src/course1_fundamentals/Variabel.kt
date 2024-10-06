package course1_fundamentals

fun main() {

    /*
    * var ( mutable )
    * val ( immutable ) in java it's called final
    */

    var sayHello = "Good Morning"
    val sayGoodbye = "Goodbye John"
    sayHello = "Good afternoon"
//    sayGoodbye = "Goodbye Doe" would be a mistake
    println("mutable - sayHello to " + sayHello)



}