package course1_class_collection

fun main() {
    /*
     sequence adalah struktur data yang mendukung pemrosesan data secara lazy (ditunda).
     Ini berarti setiap elemen dalam sequence tidak langsung dihitung saat dibuat,
     melainkan hanya dihitung saat dibutuhkan. Sequence bermanfaat untuk memproses data besar
     tanpa membebani memori karena menghitung elemen satu per satu.

     Eager evaluation eager evaluation berarti bahwa semua argumen fungsi dan ekspresi dieksekusi
     secara langsung, tanpa menunggu waktu hingga nilainya benar-benar diperlukan dalam program.
     contoh distinct, slice, chunked
     */

    // Implement eager evaluation
    val listNumber = (1..100).toList();
    val filter = listNumber.filter {it % 4 == 0}.map{it * 5}.first();
    println("Eager Evaluation : $filter")

    // Implement lazy evaluation - jika menggunakan listNumber dapat di convert menjadi sequence
    // dengan asSequence
    val listBigNumber = generateSequence(1) {it + 1}.take(10000);
    val filterLazy = listBigNumber.filter { it % 10 == 0 }.map { it + 2 }.first();
    println(filterLazy)

}