package course1_oop
/*
*  extension adalah fitur yang memungkinkan kita untuk menambahkan fungsi atau properti
*  baru pada kelas yang sudah ada tanpa perlu mengubah kode asli kelas tersebut.
*/

// Extension Method
fun Int.printInt(number : Int) : String{
    return "Value of $this is not equals $number?"
}

// Extension Properties
val Int.increment : Int get() = this + 2

// Infix Function
infix fun String.sayHello(lastName : String) : String {
    return this + lastName
}

fun main() {
    println(10.printInt(10))
    println(10.increment)

    val value = "John " sayHello "Doe"
    print(value)
}