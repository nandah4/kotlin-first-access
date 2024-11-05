package course1_class_collection

/*
    Set adalah collection atau struktur data yang digunakan untuk menyimpan data, tetapi elemen
    tidak boleh sama atau harus unik, jika terdapat element sama akan dianggap hanya ada 1 elemen.
    - Pada muttable set dapat menambah dan menghapus element tetapi tidak dapat mengubah nilai.
    - Urutan atau indexing pada set tidak berurutan
 */

fun main() {
    val myFavNumber : Set<Int> = setOf(1, 1, 2, 3);
    val numberA = mutableSetOf(2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numberB = mutableSetOf<Int>(2, 5, 6, 2, 3, 11, 20);

    val numberC = mutableSetOf(1, 2, 3, 4, 5, 6, 7)
    val numberD = mutableSetOf(1, 2, 3, 4, 5, 6, 7)
    numberC.add(9)
    numberD.add(10)

    println("Size of $myFavNumber is ${myFavNumber.size}")
    val isSimilar = if(numberB == numberA) true else false
    val isSimilar2 = if(numberC == numberD) true else false

    val union = numberA.union(numberB);
    val intersection = numberB.intersect(numberA)
    val substract = numberC.subtract(numberD)
    println(union)
    println(isSimilar)
    println(intersection)
    println(substract)

    // Symetric Difference tidak ada method secara langsung yang membuktikannya
    println((numberC - numberD) union  (numberD - numberC))
    println(isSimilar2)

}