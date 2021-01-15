package ejercicio049

// Ejercicio 49: Cambiar la base numérica de un número entero con el método toString().

fun main() {
    var numeroEntero: Int = 8

    println(numeroEntero)   // 8
    println(numeroEntero.toString(2))   // 1000
    println(numeroEntero.toString(8))   // 10
    println(numeroEntero.toString(16))  // 8

    println()

    for(i in 0..20 step 2)
        println(i.toString(2))
}
