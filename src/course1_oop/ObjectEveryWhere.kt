package course1_oop

fun main() {
    /*
        Kotlin semua bertindak sebagai objek di mana kita bisa memanggil member function
        dan properti dari sebuah variabel. Objek merupakan hasil realisasi dari sebuah
        blueprint atau class yang tentunya memiliki fungsi dan juga properti sama seperti
        blueprint-nya. Artinya, dengan membuat objek kita dapat mengakses fungsi dan properti
        yang terdapat pada kelas tersebut.
     */
    val someString = "Android Dev"

    println(someString.length);
    println(someString.reversed()); // using reversed function
    println(someString.get(2));
}