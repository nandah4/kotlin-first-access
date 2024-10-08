package course1_controlflow

fun main() {
    // While bersifat entry controller loop
    var sayGoodbye = 1;
    while (sayGoodbye <= 10) {
        println("Goodbye Pariston! $sayGoodbye")
        sayGoodbye++;
    }

    println(" ")

    // Do While bersifat exit controlled loop

    var sayHello = 1;
    do {
        println("Good Afternoon Hera $sayHello")
        sayHello++;
    } while (sayHello <= 10)


}
