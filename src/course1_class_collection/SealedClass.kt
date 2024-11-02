package course1_class_collection

/*
    Sealed class Sealed class memungkinkanmu mendefinisikan beberapa subkelas yang terkait
    dengan kelas utamanya, sambil membatasi agar hanya subkelas tertentu yang bisa dibuat
    dari kelas tersebut.

    ketika menggunakan Sealed Class adalah ia bersifat exhaustive.
    Artinya, Anda harus menangani setiap kondisi yang ditentukan pada Sealed Class.
 */

enum class ErrorSeverity {
    MINOR, MAJOR, CRITICAL
}

sealed class Error(val errorCategory : ErrorSeverity) {
    class NetworkError(val message : String) : Error(ErrorSeverity.MAJOR)
    class DatabaseError(val message: String) : Error(ErrorSeverity.MAJOR);
    object RuntimeError : Error(ErrorSeverity.CRITICAL)
}

fun main() {
    val errors : Error = Error.DatabaseError("Oops!");
    when(errors) {
        // Ketika salah satu handle class dihapus, maka akan error (sifat exhaustive)
        is Error.NetworkError -> {
            println("${errors.message} has Network Error")
        }
        is Error.DatabaseError -> {
            println("${errors.message} has Db Error ")
        }
        is Error.RuntimeError -> {
            println("Runtime Error")
        }
    }
}