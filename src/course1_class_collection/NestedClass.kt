package course1_class_collection

/*
    - Nested class adalah kelas di dalam kelas lain tapi tidak memiliki akses langsung ke anggota
      dari kelas luar (seperti variabel atau fungsi).
    - Inner class adalah versi khusus dari nested class yang
      memiliki akses langsung ke anggota kelas luar.
 */

class House {
    val room = 10;

    class BathRoom {
        // Nested class tidak dapat mengakses variabel room
        fun washBody() {
            println("Take a shower in the bathroom");
        }
    }

    inner class FamilyRoom {
        // Dengan keyword inner class, maka var diluar nested class dapat diakses
        val room = 2;
        fun watchingTv() {
            // this@outerclass untuk mengakses variabel di luar inner class (2 nama variabel sama)
            println("The family room is at number ${this@House.room}")
        }
    }
}

fun main() {
    val spideyHouse = House();

    House.BathRoom().washBody(); // called nested class

    spideyHouse.FamilyRoom().watchingTv() // called inner class
    House().FamilyRoom().watchingTv()

}

private  class Orang {}
