package ejercicio021

// Ejercicio 21: Definir variables mutables e inmutables con las palabras clave var y val.

fun main() {
    // Con val se declaran variables inmutables (no pueden cambiar su valor).
    val numeroEntero: Int = 10
    println("El valor de la variable numeroEntero es: $numeroEntero")

    println()

    // numeroEntero = 1000 // Las variables declaradas con val son constantes.

    var numeroReal : Double = 3.141519
    println("El valor de la variable numeroReal es: $numeroReal")

    println()

    numeroReal = 2.7172
    println("El valor de la variable numeroReal es: $numeroReal")
}
