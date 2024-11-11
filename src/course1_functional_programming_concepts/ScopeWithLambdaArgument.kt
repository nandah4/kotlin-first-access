package course1_functional_programming_concepts

fun main() {
    /*
        Let digunakan saat kita ingin memanipulasi nilai sementara tanpa mengubah variabel aslinya
        atau saat kita ingin melakukan sesuatu hanya jika objek tidak null.
     */

    val message : String? = null;
    message?.let {
        val lengthMess = it.length * 2
        val text = "Text length $lengthMess"
        println(text)
    } ?: run {
        println("Pesan bernilai null")
    }

    /*
    Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari
    konteks objek. Namun untuk konteks objeknya tersedia sebagai argumen (it).
    Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek
    sebagai argumen tanpa harus mengubah nilainya.
     */

    val fruits = mapOf(
        1 to "Banana",
        2 to "Strawberry"
    )
    fruits.also {
        println("Fruits length: ${it.get(1)?.length}")
    }





}