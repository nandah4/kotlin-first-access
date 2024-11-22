package kotlin_members

fun sumBigTwo( vararg numbers : Int) : Any {
    return numbers.sortedDescending().take(2)
}
fun splitNumber(number: Int) : Any {
    val numStr = number.toString()
    val iteratorA = numStr.map { it.digitToInt() }

    val min = iteratorA.minOrNull() ?: 0
    val max = iteratorA.maxOrNull() ?: 0;
    return min + max
}

fun extractedNumInString(message : String, number : Int) : Any {
    val numMess = message.filter{it.isDigit()}
    val messagePure = message.filter { !it.isDigit() }

    val res = if(numMess.isNotEmpty()) numMess.toInt()  * number else number

    return "$messagePure$res"
}


fun main() {

    println(extractedNumInString("Apa100", 2))

//    println(splitNumber(1232))
//    println(sumBigTwo(1, 3, 5, 7, 9 , 11))
}