package course1_class_collection

import javax.xml.crypto.Data

/*
    Destructuring declarations di Kotlin adalah cara untuk memecah (destructure) sebuah objek
    menjadi beberapa variabel sekaligus dalam satu baris kode. Ini berguna ketika
    ingin mengambil beberapa nilai dari objek kompleks, seperti Pair, Triple,
    atau bahkan objek kustom, dan menyimpannya ke dalam variabel terpisah secara langsung.
 */

data class DataPhone(val jenis: String, val colour: String) {

    // implements behaviour in data class
    fun intro() {
        println("She has a $jenis and $colour color")
    }
}

fun main() {
    val phone1 = DataPhone("iPhone 13", "Green");
    val (name, colour) = phone1 // Destructuring Properties

    println(name)
    println(colour)
    phone1.intro()
}