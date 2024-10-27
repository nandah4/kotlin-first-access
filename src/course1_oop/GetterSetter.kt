package course1_oop

class Car {
    var color : String = "Red"
    var merk : String = "Ducati"
        get() {
            // perlu mengembalikan elemen pada fun get
            println("Func get is called")
            return field // key field untuk mengembalikan nilai dari propertie sendiri
        }
        set(value) {
            println("Func set is called")
            field = value;
        }
}

fun main() {
    var ducati = Car();
    println("${ducati.merk} has color ${ducati.color}")
    ducati.merk = "BMW";
    println("${ducati.merk} has color ${ducati.color}")
}