package course1_class_collection

/*
    Data class di Kotlin adalah jenis kelas khusus yang dirancang untuk menyimpan data.
    Mereka digunakan saat perlu membuat kelas yang hanya bertujuan untuk menyimpan
    beberapa nilai tanpa banyak logika tambahan.

    3 method dasar yagn dimiliki data class
    - toString(), equals(), dan hashCode()
 */

data class DataUser(val name : String, val age : Int)
class User(val name: String, val age: Int) {

    // toString method untuk return string dari object
     override fun toString() : String {
        return "User(name=$name, age=$age)"
    }

    //    override fun hashCode() : Int {
    //        val result = name.hashCode();
    //        return result
    //    }

}

fun main() {
    val dataUser = DataUser("John Doe", 10)
    val user = User("John Bro", 34)

    println(dataUser) // (name=John Doe, age=10)
    println(user) // User@312b1dae adalah memory address

    // equals method
    println(user.equals(dataUser))

    // hash method
    println(user.hashCode())

    // copy method
    val dataUser5 = dataUser.copy(age = 3)
    println(dataUser5)
}