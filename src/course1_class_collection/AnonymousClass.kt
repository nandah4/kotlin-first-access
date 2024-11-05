package course1_class_collection

/*
    Membuat kelas anonim untuk implementasi antarmuka atau kelas abstrak yang hanya perlu
    digunakan sekali.
 */



interface IFly {
    fun fly()
}

fun flyWithWings(bird : IFly) {
    bird.fly()
}

// Function SAM Interface (Single Abstract Method)
fun interface IWalk {
    fun walk()
}

fun walkWithFoot(dog : IWalk) {
    dog.walk();
}

fun main() {
    // Penggunaan Anonymous Class
    flyWithWings(object  : IFly {
        override fun fly() {
            println("The bird flying")
        }
    })

    walkWithFoot{
        println("The dog walking")
    }

}