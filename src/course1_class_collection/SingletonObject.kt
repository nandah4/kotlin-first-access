package course1_class_collection

/*
    Singleton Object adalah pattern untuk memastikan suatu object hanya memiliki satu instance
 */

object CentralLibrary {
    fun readBookById(id: Int) {
        println("Book with id $id has been read");
    }
    fun borrowedBookById(id : Int) {
        println("Book with id $id has been borrowed")
    }
}

class Singleton {
    fun meminjam(name : String) {
        println("$name meminjam barangmu")
    }
}

fun main() {
    // class dapat memiliki lebih dari satu instace
    val user1 = Singleton();
    val user2 = Singleton();

    if(user1 === user2) {
        println()
        println("${user1.hashCode()}")
        println("${user2.hashCode()}")
    } else {
        println("$user1 dan $user2 tidak sama")
    }

    val userA = CentralLibrary;
    val userB = CentralLibrary;

    /* Membuktikan object class hanya memiliki satu instace maka kode akan meunjukkan bahwa
     userA dan userB merujuk pada instance yang sama
     */
    println("${userA.readBookById(13).hashCode()}")
    println("${userB.readBookById(13).hashCode()}")

    CentralLibrary.readBookById(id = 29)
    CentralLibrary.borrowedBookById(id = 1);

}
