package course1_oop

abstract class Bus(val name : String, val colour : String, val maxSpeed : Double) {
    abstract fun turnLeft();
}

class Marcedes( name : String, colour: String, maxSpeed: Double) : Bus(name, colour, maxSpeed ) {
    override fun turnLeft() {
        println("${this.name} can turn left ")
    }

}

fun main() {
//    val bus = Bus() tidak dapat instance langsung dari class abstract bus
    val marcedes = Marcedes("Marcedes", "Red", 203.1);
    marcedes.turnLeft();
}
