package course1_fundamentals

fun fullName(firstName: String, midName: String, lastName: String) {
    println("$firstName $midName $lastName")
}

fun main() {
    // it's called named argument
    fullName(firstName = "Aizen", midName = "so", lastName = "Sosuke");
}