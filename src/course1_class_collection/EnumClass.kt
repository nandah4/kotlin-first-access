package course1_class_collection

/*
    Enum class di Kotlin adalah tipe data khusus yang digunakan untuk mewakili kumpulan
    nilai konstan (FIX) yang terkait satu sama lain.
 */

enum class Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
enum class Color(val value : Int){
    RED(0xFF0000), GREEN(0xFF0001), BLUE(0xFF0100)
}


fun main() {
    val color : Color = Color.BLUE;
    println(Color.RED)
    println(Day.SUNDAY)

    // mendapatkan posisi objek dengan ordninal
    println(Color.RED.ordinal)

    /*
        Setiap enum class memiliki sebuah synthetic method yang memungkinkan kita
        mendapatkan daftar objek Enum dan nama dari tiap Enum itu sendiri.
     */

    val colors : Array<Color> = Color.values();
    colors.forEach { item -> print("$item and ${item.value.toString(16)} ") }


}