package course1_fundamentals

fun main() {

    // Kotlin does not support ternary operator

    var numberA = 10;
    var numberB = 20;
    var message : String;

    if(numberA < numberB) {
        message = "A smaller than B"
    } else {
        message = "A bigger than B"
    }
    println(message);

    var booleanA = false;
    var valueOfBooleanA = if(booleanA == true) {
        "Boolean a is True"
    } else {
        "Boolean a is False"
    }
    println(valueOfBooleanA)
}