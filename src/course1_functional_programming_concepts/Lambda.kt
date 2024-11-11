package course1_functional_programming_concepts

/*
    Lambda adalah cara membuat fungsi sederhana, atau disebut fungsi anonimus yang biasanya
    digunakan untuk tugas-tugas kecil
 */
/*
 Struktur umum lambda
 */
val summ : (Int, Int) -> Int = {
        a, b -> a + b
};


val sayHellp = { name : String -> "Hello $name"}; // lambda func

fun main() {
    val numbers : IntProgression = 1..50 step 10;

    println(sayHellp("John Doe"))

    /*
     Aturan di mana ketika argumen dari sebuah lambda expression tidak digunakan,
     kita disarankan agar mengubahnya menjadi _ untuk menggantikan nama dari
     argumen tersebut.
     */
     numbers.forEachIndexed{index, it ->
        println("Element ke-$index with value $it")
    }

}
