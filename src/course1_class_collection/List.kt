package course1_class_collection

/*
    List adalah struktur data berisi sekumpulan data angka, karakter atau yang lainnya.
    Yang menarik, sebuah List tidak hanya bisa menyimpan data dengan tipe yang sama.
    Namun juga bisa berisi bermacam - macam tipe data seperti Int, String, Boolean atau
    yang lainnya.
 */


// Struktur dasar list
val fruit : List<String> = listOf("Mango", "Banana", "Strawberry");

// Immutable List

// Shortcut list
val snack = listOf("Hatori", "Tango");

// Mutable List

val food = mutableListOf("Burger", "Hot dog")

fun main() {
    // Cara akses list
    // fruit[0] = "Grapes" akan error karena sifat immutbale - tidak dapat diubah
//    println(fruit[0]);
//    println(snack[1]);

    // Mutable list
    food.add("Pizza") // menambahkan element ke mutable list
    food.addFirst("Ramen")

    food.remove("Pizza")
    food.removeAt(1)
    food[1] = "Hot Dog Jumbo"

    food.forEach {element ->
        println("$element")
    }
}