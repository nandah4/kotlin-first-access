package course1_controlflow

fun main() {
    val myNumber = arrayOf(10, 2, 3, 11, 33, 21, 9, 8)
    val rangeNumber = 2..20
    for (number in myNumber) {
        println(number)
    }

    rangeNumber.forEach { value ->
        if(value % 2 === 0) {
            println(value)
        }
    }

    for ((index, value) in rangeNumber.withIndex()) {
        println("this value $value index-$index")
    }
}