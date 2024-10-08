package course1_controlflow

/*
    When Expression seperti switch case
 */

fun main() {
    var value = 3;
    when(value) {
        1 ->println("value is $value")
        2 ->println("value is $value")
        3 ->println("value is $value")
        else -> println("value is not found")
    }

    val book = "kamus";
    var message:String;
    val isCondition = when(book) {
        "lks" -> {
            message = "This book is LKS"
            println("LKS")
        }
        "kamus" -> {
            message = "This book is Kamus"
            println("Kamus")
        }
        else -> message = "Book is not match with any option"
    }
    println(isCondition)
    println(message)

    val thisValue = 14
    var range = 10..40

    when(thisValue) {
        in range -> println("14 is on Range")
        else -> println("14 is not on range")
    }

}