package course1_class_collection

/*
    Map adalah collection yang dapat menyimpan data dengan format key-value
 */

fun main() {
    val capital = mapOf(
        "Indonesian" to "Indonesia",
        "Singapore" to "Singapura",
        "Malaysia" to "Malaysian"
    )

    println(capital.get("Indonesian"));
    println(capital.keys)
    println(capital.values)
    println(capital["Malaysia"])
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put(key = "China", value = "Changdu");
    println(mutableCapital.values)
}