package course1_oop

// Handle dengan try-catch
fun division(numberA : Int, numberB : Int) {
    try {
        var result = numberA / numberB
        println(result)
    } catch (e: Exception) {
        println(e.message) // / by zero
    } catch (e: ArithmeticException) {
        // blok ini adalah multiple catch
        print(e.message)
    }
}

// try-catch-finally



fun main() {
    division(1, 0)
}