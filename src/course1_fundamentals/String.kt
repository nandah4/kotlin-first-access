package course1_fundamentals

fun main() {
    val textString = "Hello World"
    val indextOfText = textString[4]
    println("${indextOfText} is a index 4");

    for(char in textString) {
        print(char) // expected output Hello World
    }

    println("")

    // Literal String - Escape Character
    var quote = "\"Dia\" lebih manis dari pada madu";
    println(quote)

    // Literal String - Raw String
    var textIndent = """
        this text is multiline
        it is seccond line
        it is third line
    """.trimIndent()
    println(textIndent)

    val favouriteFood = "Burger"
    val price = 56000

    // String Template.
    // when u add an expression in a String, use curly braces and following it by $
    println("My favourite food is a $favouriteFood. The price is mid, which is Rp.$price")

}