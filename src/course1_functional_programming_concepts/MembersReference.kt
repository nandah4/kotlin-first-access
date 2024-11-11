package course1_functional_programming_concepts

/*
 Struktur umum lambda
 */
val sum : (Int, Int) -> Int = {
    a, b -> a + b
};

var mutableMessage : String = "Kotlin Developer"

fun main() {
    /*
        Function reference (::)
     */

    fun isEvenNumber(number : Int) = number % 2 == 0

    val rangeNumber = 1..20
    val result = rangeNumber.filter(::isEvenNumber)
    println(result)

    /*
        Properties Reference (::)
     */

    println(::mutableMessage.name)
    println(::mutableMessage.get())
    ::mutableMessage.set("Koltin Aja")
    println(mutableMessage)

    //    var muttableInnerMessage = "Kotlin Inner Message"
    //    println(:;muttableInnerMessage.name) error
    //    println(::muttableInnerMessage.get())





}