package course1_fundamentals

fun main() {
    var randomElemenArray = arrayOf("Cow", 10, 10.20, "Cat")
    randomElemenArray[3] = "Tiger"
    println(randomElemenArray[2]);
    println(randomElemenArray[3]);

    // One type of array element (byte, short, int, long, bool, char)
    var arrayInt = intArrayOf(10, 2, 101, 22);
    for(int in arrayInt) {
        println(int)
    }


}