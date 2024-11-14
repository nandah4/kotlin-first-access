     package course1_kotlin_generics

/*
    Variance adalah konsep yang menggambarkan bagaimana sebuah tipe memiliki
    subtipe yang sama dan tipe argumen yang berbeda saling berkaitan satu sama lain
    Variance dibutuhkan ketika kita ingin membuat class atau func generic dengan batasan
    yang tidak akan menganggu dalam penggunaanya.

    Cara membuat kelas generic yang memiliki variance? Caranya sama seperti ketika kita membuat generic
\    kelas pada umumnya. Namun, untuk tipe parameternya, kita membutuhkan kata kunci out untuk covariant
    atau kunci in untuk contravariant.

 */

abstract class Vehicle(wheel : Int)
open class Car(speed: Int) : Vehicle(4)
open class Motorcyle(speed: Int) : Vehicle(2)


class Kawasaki(speed : Int, val name : String) : Motorcyle(speed),Turnleft<String> {
    override fun turnLeft(): String {
        return "$name can Turn Left"
    };
}
     class Mio(speed: Int, val name : String) : Motorcyle(speed), Turnright<String> {
         override fun turnRight(turn: String) {
             println("$name can turn right")
         }
     }


/*
    Contravariant
    Kata kunci out, nilai dari tipe parameter tersebut hanya bisa diproduksi seperti menjadikanya sebagai return type
 */
interface Turnleft <out Turn>  {
    fun turnLeft() : Turn;
}

/*
    Covariant
    Nilai dari tipe parameter in tersebut bisa dikonsumsi dengan menjadikannya sebagai tipe argumen untuk setiap fungsi
    yang ada di dalam kelas tersebut dan tidak untuk diproduksi.
 */

     interface Turnright <in Turn> {
         fun turnRight(turn : Turn)
     }

fun main() {
    // covariant
    val kawasaki = Kawasaki(200, "Kawasaki")
    println(kawasaki.turnLeft())

    // variant
    val mio = Mio(60, "Mio")
    mio.turnRight("Turn right")


    val pajero = Car(10)
    var vehicle : Vehicle = pajero
    vehicle = kawasaki

}
