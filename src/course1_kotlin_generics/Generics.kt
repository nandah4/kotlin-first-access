package course1_kotlin_generics

/*
    Generics adalah suatu konsep yang memungkinkan suatu class atau interface
    menjadi tipe parameter yang dapat digunakan untuk berbagai macam tipe data.
 */

fun main() {
    val listGenerics = listOf<String>("Member-1")

    /*
        Ketika elemen tidak ditentukan langsung maka tipe parameter wajib ditentukan diawal
     */
    val listGenerics2 = listOf<Int>()

    /*
        Beberapa collection dapat menerima 2 tipe params seperti mapOf
     */
    val mapGenerics = mapOf<Int, String>(2 to "Member-2")
}