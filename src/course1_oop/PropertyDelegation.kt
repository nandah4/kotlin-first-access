package course1_oop
import  kotlin.reflect.KProperty
/*
    import kotlin.reflect.KProperty: Ini mengimpor kelas KProperty dari paket kotlin.reflect.
    Kelas ini digunakan untuk merepresentasikan properti dalam refleksi di Kotlin,
    dan memungkinkan kita mengakses nama properti serta metadata lainnya
*/

class DelegateName {
    private var value : String = "Default";

    /*Kata kunci operator memungkinkan kita untuk mendefinisikan perilaku khusus saat
    sebuah properti yang didelegasikan diakses (getter). Jadi, setiap kali properti yang
    menggunakan DelegateName dipanggil, fungsi getValue ini akan dijalankan.*/

    /*
    Parameter classRef: Any?: Ini merepresentasikan referensi dari objek yang memiliki properti ini.
    Any? berarti tipe objek bisa apa saja (Any adalah supertype dari semua kelas di Kotlin),
    dan properti ini bisa bernilai null.
     */

    /*
    Parameter property: KProperty<*>: property merepresentasikan properti itu sendiri sebagai objek refleksi,
    yang memungkinkan kita mengakses nama properti serta metadata lainnya. KProperty<*> artinya ini bisa
    digunakan dengan properti tipe apapun (* menandakan tipe generik).
    */
    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi atau method ini sama dengan getter untuk properti ${property.name}")
        return value;
    }

    /*
    * Parameter newValue: String: Ini adalah nilai baru yang akan disetel ke properti. Jadi, setiap kali kamu mencoba
    * mengubah nilai properti yang menggunakan delegasi ini, nilai baru tersebut diteruskan melalui parameter ini.*/
    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue : String) {
        println("Fungsi ini sama dengan setter untuk properti ${property.name}")
        value = newValue
    }
}

class House {
    var name : String by DelegateName() ;
}
class Hero {
    var name : String by DelegateName()
}

fun main() {
    val house = House();
    house.name = "American House"
    print(house.name)
}


