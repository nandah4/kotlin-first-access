package course1_functional_programming_concepts

fun aritmatics(numberA : Int, numberB : Int) {
    fun summary(numberA : Int, numberB: Int) {
        val result = numberA + numberB
        println(result)
    }
    summary(numberA, numberB)
}

fun sum(valueA : Int, valueB : Int) : Int{
    fun Int.validateNumber() {
        if(this == 0 ) {
            throw IllegalArgumentException("value must be better than 0")
        } else {
            println("Value yang anda masukkan $this")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()

    return  valueA + valueB;
}

/*
    Inner Function implement to Extension Function
 */

fun main() {
    val valueA = 10;
    val valueB = 20;
    aritmatics(valueA, valueB)
    println(sum(valueA, valueB))
    val total = listOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    val result1 = total.distinct()
    val result2 = result1.slice(1..3)
    println(result2)
}
