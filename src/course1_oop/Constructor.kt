package course1_oop

// Primary constructor didefinisikan di header class.
class Animal2(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMamal: Boolean

    init {
        this.name = name;
        this.age = if (age < 1) 0 else age
        this.weight = weight
        this.isMamal = false
    };

    // secondary constructor
    constructor(name: String, weight: Double, age: Int, isMamal: Boolean) : this(name, weight, age) {
        this.isMamal = isMamal;
    }
}

fun main() {

    // ketika is mamal tidak tersedia dan ditangani oleh primary constructor
    val kambing2 = Animal2("Shaun", 20.1, 4 );
    println(kambing2.isMamal)

    // ketika nilai isMamal tersedia dan ditangani oleh secondary constructor
    val kambing = Animal2("Shaun", 20.1, 4, true );
    println(kambing.isMamal)


}



