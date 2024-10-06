package course1_fundamentals

fun main() {
    var doubleMaxValue = Double.MAX_VALUE;
    var doubleMinValue = Double.MIN_VALUE;
    println("Maximum : $doubleMaxValue and Minimum : $doubleMinValue")

    // Casting data type using .to.. function
    var intNumber = 102;
    var decimalNumber : Double = 322.8
    var doubleNumber : Double = intNumber.toDouble();
    println(doubleNumber);

    var doubleToShort : Int = decimalNumber.toInt()
//    var doubleToShort : Byte = decimalNumber.toByte() short and byte does not support narrowing casting from decimal to integer.
    println(doubleToShort)


    // Readable number
    val bookPrice = 100_300;

}