package course1_class_collection

fun main() {

    /*
        Fold adalah seperti alat yang "melipat" elemen-elemen dalam daftar satu per
        satu dan menghasilkan nilai akhir
        fold, foldRight()
     */

    val numberOfList = listOf(2, 4, 6, 8, 10, 12, 14, 16)

    val fold = numberOfList.fold(0) {acc, current ->
        // current merepresentasikan masing-masing item
        // acc yang merepresentasikan nilai awal
        // fold (...) menentukan nilai awal dalam konteks di atas = 0
        println("operations : $acc")
        acc + current
    }
    println(fold)

    /*
        Drop adalah fungsi yang mengabaikan sejumlah elemen
        pertama dalam daftar dan hanya menyisakan sisanya
     */

    val drop = numberOfList.drop(2)
    // drop(..) menentukan sampai urutan elemen akan diabaikan dalam konteks sampai elemen ke 2
    println("Hasil drop : ${drop}")

    /*
        Take adalah fungsi untuk menentukan jumlah item yang akan disaring
        take(), takeLast()
     */

    val take = numberOfList.take(4)
    val takeLast = numberOfList.takeLast(3)
    println("Take $take")
    println("Take Last $takeLast")

}