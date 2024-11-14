package course1_kotlin_generics

import course1_oop.sum

/*
    Deklarasi argumen generic pada interface
 */

interface Lista<T> {
    operator fun get(index : Int) : T
}

/*
    Deklarasi argumen generic pada class
 */
class IntList<T> : Lista<Int> {
    override fun get(index: Int) : Int {
        return  index
    }
    fun sum(index: Int) {
        println(index + index)
    }
}

fun main() {
    val intList = IntList<Int>()
    val printIndex = intList.get(10)
    println(printIndex)
    intList.sum(10)
}

