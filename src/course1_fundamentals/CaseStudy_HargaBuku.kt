package course1_fundamentals

fun main() {
    println(getBook("manga", 1))
    println(getBook("komik", 10))
}

fun countDiscount(hargaBuku: Double = 0.0, jumlahBuku: Int = 0): Double {
    var discount: Double = 0.0;

    if(jumlahBuku > 3) {
        discount = hargaBuku - (hargaBuku * 0.15);
    } else if( jumlahBuku > 5) {
        discount = hargaBuku - (hargaBuku * 0.20);
    } else {
        discount = hargaBuku;
    }
   return discount
}

fun getBook(jenisBuku: String, jumlahBuku: Int) : String {
    var costOfBook = arrayOf(48_000.0, 53_000.0, 75_000.0)
//    val komik : Double = 48_000.0;
//    val kamus : Double = 53_000.0;
//    val manga : Double = 75_000.0;

    if(jenisBuku.equals("komik", ignoreCase = true) ) {
        return "You bought $jumlahBuku pcs, so you must pay Rp. ${countDiscount(costOfBook[0], jumlahBuku)} for ${jenisBuku.uppercase()}"
    } else if (jenisBuku.equals("kamus", ignoreCase = true)){
        return "You bought $jumlahBuku pcs, so you must pay Rp. ${countDiscount(costOfBook[1], jumlahBuku)} for ${jenisBuku.uppercase()}"
    } else if (jenisBuku.equals("manga", ignoreCase = true)){
        return "You bought $jumlahBuku pcs, so you must pay Rp. ${countDiscount(costOfBook[2], jumlahBuku)} for ${jenisBuku.uppercase()}"
    } else {
        return "Jenis buku not found"
    }
}

