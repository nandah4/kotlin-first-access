package course1_functional_programming_concepts

/*
    Recursive function adalah sebuah mekanisme di mana sebuah fungsi digunakan
    dari dalam fungsi itu sendiri.
 */

fun factorial(n : Int) : Int {
    return if(n== 1) {
        n
    } else {
        n * factorial(n-1)
    }
}

tailrec fun factorialV2(n : Int, result : Int = 1) : Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorialV2(n - 1, newResult)
    }
}

/*
    Tail Call Recursion tail recursion yakni sekumpulan urutan instruksi untuk menjalankan tugas tertentu (subroutine)
    yang dijalankan terakhir pada sebuah prosedur.
    secara default JVM tidak mendukung optimasi tail recursion. Untuk itu, Kotlin menyediakan modifier agar
    kita bisa tetap menerapkannya, yaitu modifier tailrec. etika sebuah fungsi ditandai dengan modifier tailrec,
    maka fungsi tersebut hanya boleh dipanggil untuk dijalankan terakhir dan tidak boleh digunakan dari dalam blok
    try-catch-finally.
 */

fun main() {
    println(factorial(2))
    println(factorialV2(5))
}

