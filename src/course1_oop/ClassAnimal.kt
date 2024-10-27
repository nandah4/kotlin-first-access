package course1_oop

/*
    - lateinit untuk menunda inisialisasi properti di awal
    - lazy harus menggunakan val karena nilainya hanya dapat di init 1 kali
 */

class Animal {
    lateinit var name : String;
    val weight : Double by lazy {


        10.1
    }
    var age : Int = 14;
    var isMamal : Boolean = false;

    fun eat() {
        println("Animal $name can Eat")
    }
    fun sleep() {
        println("Animal $name can Sleep")
    }

    fun checkInit() {
        if(::name.isInitialized)
            println(name.length)
        else
            println("Not init")
    }
}

fun main() {
    var cat = Animal();
    cat.name = "Cat"
    println("Name : ${cat.name}, age : ${cat.age}");
//    cat.weight = 20.1; error
    cat.sleep()
    cat.eat()
    cat.checkInit()


}