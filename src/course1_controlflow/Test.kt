package course1_controlflow

fun main() {
    for (i in 10.rangeTo(11)) {
        print("$i ")
    }
    for (i in 1..3) {
        for (j in 1..i) {
            print(j)
        }
    }
}