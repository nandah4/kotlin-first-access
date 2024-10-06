package course1_fundamentals

fun getFullAddress(streetName: String, number: Int): String {
    return "I live in $streetName No. $number"
}

fun main() {
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }

   println( getFullAddress(number = 1, streetName = "a"))
}
