package ejercicio047

// Ejercicio 47: Convertir de forma explícita entre diferentes tipos de datos primitivos.

fun main() {
    var numeroEntero: Int = 10

    // var auxiliar: Long = numeroEntero // Conversión explícita en Java

    var numeroEntero64: Long = numeroEntero.toLong()
    println(numeroEntero64)

    println()

    var numeroReal32: Float = 3.141592f

    var numeroReal64: Double = numeroReal32.toDouble()
    println(numeroReal64)
}
