package course1_kotlin_generics


/*
    Dalam penerapan Generics, kita dapat membatasi berbagai tipe yang dapat digunakan
    sebagai parameter. Dengan menambahkan (: nama_tipe)
 */

interface Numberable<T : Number> {
    fun showListNumber(numbers : List<T>)
}

class List2 <T : Number> : Numberable<Int> {
    override fun showListNumber(numbers : List<Int>) {
        numbers.forEach { number ->
            println(number)
        }
    }

}

fun main() {
    val listNum = listOf(1, 2, 3, 4, 5)
    val listInstace1 = List2<Int>()
    listInstace1.showListNumber(listNum)
}

