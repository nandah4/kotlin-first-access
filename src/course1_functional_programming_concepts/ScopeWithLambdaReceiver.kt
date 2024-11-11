package course1_functional_programming_concepts

fun main() {
    /*
        Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
        Untuk mengakses konteks dari objek menggunakan this.
     */

    val scopeRun = Person("John Doe", 19).run {
        val age = this.age
        val name = this.name

        "Hello $name, very shock when i know you are $age years old"
    }
    println(scopeRun)

    /*
        Fungsi with bukanlah sebuah extension melainkan hanyalah fungsi biasa.
        Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver
        Nilai yang akan dikembalikan adalah berdasarkan expression yang berada di dalam blok lambda
     */

    var scopeWith = with("Hello Kotlin") {
        val say = this.split(" ")[0]
        val obj = this.split(" ")[1]
        "$say $obj from Indonesian"
    }
    println("with : $scopeWith")

    /*
        Fungsi apply  nilai yang dikembalikan dari fungsi apply adalah nilai dari konteks objeknya
        dan objek konteksnya tersedia sebagai receiver (this). Baiknya fungsi apply dapat
        melakukan inisialisasi atau konfigurasi dari receiver-nya
     */

    val message = Person("Joni", 10).apply {
        age = 12
        name = "Silangit Siborong-borong"
    }
    println("Hello ${message.name}, are you ${message.age} yo?")


}