package course1_oop

/*
    * Interface dalam Kotlin adalah konsep untuk mendefinisikan contract atau kesepakatan
    * tentang apa yang bisa dilakukan oleh sebuah kelas tanpa harus menentukan cara kerjanya
    * secara spesifik.
    * - ISP (Interface Segregation Principle - SOLID) 1 interface 1 tugas
*/


abstract class Device(val name: String, val colour : String,) {
}

interface Turnable {
    // Method dibawah diimplentasikan di dalam class yang menggunakannya
    // 3 method ini wajib diimplementasikan di dalam class yang menggunakannya
    fun turnOn();
    fun turnOff()
    fun restart()
}

class Iphone(name: String, colour: String) : Device(name, colour), Turnable {

    override fun turnOn() {
        println("${this.name} can turn on")
    }

    override fun turnOff() {
        println("${this.name} can turn off")
    }

    override fun restart() {
      println("${this.name} can restart the device")
    }
}

fun main() {
    val iPhone = Iphone("iPhone 13", "Green")
    iPhone.turnOn();
    iPhone.turnOff();
}