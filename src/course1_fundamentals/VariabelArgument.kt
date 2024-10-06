package course1_fundamentals

fun main() {
    println(countLength(10, 22, 1, 3, 110))
    favoritNumber("Aizen", 10, 2, 3, 12)
    herFavoritnumber(10,2,4, name = "iPhone")

    // using spread operator when set array to argument "*"
    val arrayNum = intArrayOf(10, 20, 3, 11);
    allNumber(10, 29, *arrayNum, 1)
}

// vararg untuk menyederhanakan argumen yang memiliki tipe data sama
fun countLength(vararg number : Int) : Int {
    return  number.size
}

// varargs disarankan di posisi terakhir
fun favoritNumber(name: String = "John Doe", vararg number: Int) {
    println("$name have a favourite number is ${number.sum()}")
}

// ketika varargs ditempatkan posisi pertama
fun herFavoritnumber(vararg number : Int, name: String = "Rachel") {
    println("Her name is $name and ${number.hashCode()} it is favorite number")
}

// array sebagai argumen dengan spread operator "*"
fun allNumber(vararg number : Int) {
    for (element in number) {
        print(" $element ");
    }
}
