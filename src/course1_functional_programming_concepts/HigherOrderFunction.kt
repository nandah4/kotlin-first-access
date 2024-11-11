package course1_functional_programming_concepts

/*
    Higher Order Function adalah fungsi yang menggunakan fungsi lain sebagai params, atau
    menjadikan tipe pengembaliannya

    Inline adalah fitur dalam bahasa Kotlin yang memungkinkan Anda untuk menyertakan seluruh
    kode dari suatu fungsi atau lambda (expression function) pada saat kompilasi,
    sehingga mempercepat waktu eksekusi program.  Penggunakan inline juga dapat menyebabkan
    file binary program menjadi lebih besar dan memperlambat waktu kompilasi.
 */

/*
Sebelum implement higher order

val message = { name : String ->
    "Hello $name, have a nice day!"
}
fun printMessage(name: String, message : (String) -> String){
   print(message(name))
}
*/

// implement higher order funtion with inline


inline fun printMessage2(name : String, message : (String) -> String) {
    print(message(name))
}

fun main() {

    //    printMessage("John Doe", message)

    printMessage2("John DOe") {name : String ->
        "Hello $name, have a good day!"
    }
}

