package course1_controlflow

fun main() {
    val lisOfNumber = listOf(10, 2, null, 11, 3, 4, 22, 8)

    // labels using @
    loop@ for (number in lisOfNumber) {
        if(number == null) continue
        println(number)
//        if(number == null) break
//            println(number)
    }
}
