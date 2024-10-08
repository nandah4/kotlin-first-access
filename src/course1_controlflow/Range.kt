package course1_controlflow

fun main() {
    // Range adalah salah satu unique data type in Kotlin
    // Support beberapa tipe integral yaitu IntRange, Char, dan Long.

    // range
    var numberRange = 1..10 step 2
    if(9 in numberRange) {
        println("9 is available" + numberRange.step)
    } else {
        println("is not available")
    }

    var downRange = 12.downTo(3)
    if(13 !in downRange) {
        println("TRUE")
    }
}