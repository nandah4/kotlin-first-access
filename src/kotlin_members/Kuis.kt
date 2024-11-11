package kotlin_members

fun main() {
//    val total = listOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
//    val result1 = total.distinct()
//    val result2 = result1.slice(1..3)
//    println(result2)

    val total = listOf(1, 2, 3, 4, 5, 6)
    val result1 = total.take(5)
    val result2 = result1.takeLast(4)
    val result3 = result2.drop(1)
    val result4 = result3.dropLast(2)
    println(result4)
}