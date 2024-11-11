package course1_functional_programming_concepts

/*
     "function type" adalah jenis data yang memungkinkan kita merepresentasikan
     fungsi sebagai nilai yang dapat disimpan dalam variabel, diteruskan sebagai argumen,
     atau dikembalikan dari fungsi lain
 */

/*
    @typealias untuk memberikan nama untuk sebuah function type dan menggunakannya sebagai tipe untuk fungsi lainnya
 */
typealias Aritmathics = ((Int, Int) -> Int)?

fun main() {
    val division : Aritmathics = {numberA, numberB -> numberA / numberB}
        /*
            @invoke untuk menggunakna instance dari func / lambda
         */
    val divisionResult = division?.invoke(10, 2);
    println(divisionResult)
}