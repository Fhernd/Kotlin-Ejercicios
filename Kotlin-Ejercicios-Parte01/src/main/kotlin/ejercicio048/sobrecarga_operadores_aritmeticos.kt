package ejercicio048

// Ejercicio 48: Uso de la sobrecarga de operadores para sumar valores numéricos de diferente tipo de dato.

// -, +, *, / (operadores aritméticos)

fun main() {
    var numeroEntero32: Int = 10

    // var auxiliar: Long = numeroEntero // Conversión explícita en Java

    var numeroEntero64: Long = numeroEntero32.toLong()
    println(numeroEntero64)

    println()

    var numeroReal32: Float = 3.141592f

    var numeroReal64: Double = numeroReal32.toDouble()
    println(numeroReal64)

    println()

    // Sobrecarga del operador suma:
    var suma = numeroEntero32 + numeroEntero64
    println(suma)

    println()

    // Consultar tipo de dato de la variable `suma`:
    println(suma::class.simpleName) // Long

    println()

    var sumaReales = numeroReal32 * numeroReal64
    println(sumaReales)
    println(sumaReales::class.simpleName)
}
