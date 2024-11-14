package course1_kotlin_generics

fun <T> nameLength(fullName : String) : Int {
    val length = fullName.length
    return length
}

fun main() {
    println(nameLength<String>("John Doe"))
}
