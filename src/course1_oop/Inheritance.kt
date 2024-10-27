package course1_oop

// Subclass dapat mewarisi properti dan method dari ParentClass = Inheritance
// - Di Kotlin, untuk membuat sebuah kelas bisa diwarisi (di-inherit) harus menandainya dengan kata kunci open
// - Di Kotlin, class memiliki default final (ketika inherit harus menggunakan keyword OPEN)
open class Binatang(val name : String, val weight : Double, val age: Int, val isCarnivore : Boolean) {
    open fun eat() {
        println("$name dapat makan!")
    }

    open fun sleep() {
        println("$name dapat tidur!")
    }
}

// - penambahan "p atau huruf lain" mencegah ambiguitas antara params constructor dengan variabel lokal
    class Kucing(pName : String, pWeigth: Double, pAge : Int, pIsCarnivore : Boolean, val furColour: String, val numberOfFeet : Int) : Binatang(pName, pWeigth, pAge, pIsCarnivore) {
        fun playWithHuman() {
            println("@$name bermain dengan manusia!")
        }

        override fun eat() {
            super.eat()
            println("$name makan Ikan")
        }

    }

fun main() {
    val kucing = Kucing("Kucing", 15.4, 8, true, "Light Brown", 4);
    println(kucing.name)
    kucing.eat()
}
