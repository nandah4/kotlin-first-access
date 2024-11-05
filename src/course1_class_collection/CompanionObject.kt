package course1_class_collection

/*
    Cara untuk mendeklarasikan member statis di dalam kelas, object yang terhubung dengan
    class, tetapi tanpa perlu membuat instance dari kelas itu.
    Inner object tidak dapat dituliskan langsungs di dalam class, untuk mengatasinya dengan cara
    companion object

    Hal yang paling terlihat adalah kondisi ketika mendeklarasikannya
    Val didefinisikan ketika runtime, sedangkan const val harus didefinisikan ketika compile time.
    Jadi, const val harus didefinisikan secara langsung, bukan dalam bentuk pemanggilan fungsi.

 */

class Library{
    fun totalBook() {
        println("Total book $LIBRARY_NAME is unlimited")
    }

    // const val (hanya bisa dideklarasikan di top level atau di dalam object companion.)
    companion object {
    const val LIBRARY_NAME = "META LIBRARY"
    }
}

fun main() {
    val name = Library.LIBRARY_NAME;
}