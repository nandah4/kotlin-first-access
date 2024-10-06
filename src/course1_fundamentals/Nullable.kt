package course1_fundamentals

fun main() {
    var university : String? = "State Polytechnic of Malang"
    if(university != null) { // smart cast but it was traditional
        println(university.length)
    }

    // Safe Calls Operator
    var text: String? = null
    var textLength = text?.length;
    println(textLength)

    // Elvis Operator (default value when the condition is false)
    var textLengthDefault = text?.length ?: 10;
    println(textLengthDefault)
}