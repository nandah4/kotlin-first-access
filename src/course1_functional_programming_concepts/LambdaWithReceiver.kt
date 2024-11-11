package course1_functional_programming_concepts

/*
    Lambda with receiver adalah bentuk lambda yang memungkinkan kita mengakses fungsi-fungsi atau properti dari
    objek tertentu di dalam lambda tanpa harus menyebutkan objek itu berulang kali.

    DSL (Domain Specific Language) adalah sebuah bahasa komputer yang dikhususkan untuk domain
    aplikasi tertentu. Ia berbeda dengan general-purpose language yang bisa diterapkan di semua
    domain aplikasi. Dengan DSL, kita bisa menuliskan kode lebih ringkas dan ekspresif.
 */

// Sebelum menerapkan DSL
fun buildString() : String {
    val stringResult = StringBuilder();
    stringResult.append("Apple");
    stringResult.append("Samsung");
    return stringResult.toString()
}

// setelah menerapkan DSL
fun buildString2(action : StringBuilder.() -> Unit) : String {
    val resultString = StringBuilder();
    resultString.action();
    return  resultString.toString()
}

fun main() {
    println(buildString())

    val message = buildString2{
        append("Xiome")
        append("Sungsang")
        append("Opps")
    }
    println(message)
}
