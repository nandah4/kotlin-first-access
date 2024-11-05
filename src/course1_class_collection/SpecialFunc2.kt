package course1_class_collection

fun main() {
    val numberOfList = listOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21);

    /*
        Slice mengambil beberapa elemen tertentu, slice memilih elemen-elemen dengan indeks tertentu.

        Hati-hati dengan error ArrayIndexOutOfBoundsException
     */

    val slice = numberOfList.slice(1..5)
    val slice2 = numberOfList.slice(listOf(4,2)) // Spesifik pengambilan element by index
    // slice(...) adalah range
    println("Slice : $slice")
    println("Slice : $slice2")

    /*
        Distinct akan menghilangkan duplikat dan menyisakan satu kali saja untuk setiap nilai yang unik.
     */
    val duplicateNums = listOf(numberOfList, 3, 5, 5, 5, 7, 99, 9)
    val distinct = duplicateNums.distinct()
    println(distinct)

    /*
        Chunked berguna jika kamu ingin membagi daftar besar menjadi beberapa bagian kecil (chunk) dengan ukuran tertentu
        dalam bentuk array.
     */

    val chunked = duplicateNums.chunked(2)
    println("Chunked : $chunked")




}