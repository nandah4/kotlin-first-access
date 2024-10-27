package course1_oop

/*
    Menangani ketika receiver extension bernilai null
 */

fun Int?.sum(number : Int): Int {
    // Handle null dengan elvis ops
    val summary = this?: 10 + number;
    return summary
}

fun main() {
    println(null.sum(10))
}