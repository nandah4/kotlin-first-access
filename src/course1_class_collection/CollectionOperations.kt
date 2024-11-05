package course1_class_collection

/*
    Collection Operations adalah cara untuk mengakses element di dalam collection
    dengan berbagai bentuk
 */

fun main() {
    val listNumber = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    val charList = listOf('a', 'b', 'c', 'd', 'e')

    // filter atau filterNot
    val filterNumber = listNumber.filter{ it % 2 == 0};
    println("Filter $filterNumber")

    // map
    val mapNumber = listNumber.map { it + 3 }
    println("Map $mapNumber")

    // count -> menghitung jumlah item dalam collection
    val countNumber = listNumber.count();
    println("Count $countNumber")

    // find -> untuk mencari item pada collection
    val findNumber = listNumber.find { it == 5 + 2 };

    // first -> first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection
    val findOrNullNum = listNumber.firstOrNull{it % 2 == 0}
    //    val firstElement = listNumber.first{it > 10} error
    //    println("First Element ${firstElement}")

    // sum() untuk menghitung tiap angka dalam collection, khusus integer
    val sumNumber = listNumber.sum()
    println("Sum Number : ${sumNumber}")

    // sorted() defaultnya adalah ascending
    val sortedAscending = listNumber.sorted();
    println("Sorted Ascending : ${sortedAscending}")
    val sortedDescending = listNumber.sortedDescending();
    println("Sorted Descending : ${sortedDescending}")

    println("FirstOrNull $findOrNullNum")
    println("Find $findNumber")

}
