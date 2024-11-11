package course1_functional_programming_concepts

/*
    Standar Func Library adalah sebuah extension function dari sebuah object yang menggunakan
    lambda sebagai argumen atau yang disebut higher order function

    Scope Function

    Context object cara mengakses konteks sebuah object dari dalam lambda yang menjadi bagian dari
    scope function

    Lambda Receiver (this)
 */
class Person(var name : String, var age : Int);


fun main() {

    val text = "Hello Kotlin";
    val message : String = text.let{
        "$it, from Indonesian"
    }
    println(message)

    val lamRun = "Hello Kotlin".run {
        println(this)
        this.length
    }
    lamRun
    println(lamRun)



}

