package course1_fundamentals

// this function return String type
fun sayHello(name: String, country: String ) : String {
    return "Hello, my name's $name from $country ";
}

fun countNumber(number1: Int, number2: Int, operator: String) : Any {
    if(operator === "+") {
        return number1 + number2;
    } else {
        return "Invalid operator";
    }
}

// this function is not return, sintaks Unit is opsional.
fun countWeek(day: Int) {
    var week = day / 7;
    println("Now week to $week, equals $day day");
}

// single expression function
fun setUsername(username: String) = "Your name is $username";

// default params
fun setYourAge(age: Int = 10) = println("Your age is $age")


fun main() {
    println(sayHello("John Doe", "Indonesian"));
    println(countNumber(10, 20, "+"))
    countWeek(21)
    println(setUsername("Aizen Sosuke"))
    setYourAge()
}