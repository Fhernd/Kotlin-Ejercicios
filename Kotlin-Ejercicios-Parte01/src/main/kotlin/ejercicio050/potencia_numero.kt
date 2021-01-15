package ejercicio050

// Ejercicio 50: Calcular la potencia de un número con la funcion pow() de la clase Math.

fun main() {
    var resultado = Math.pow(2.toDouble(), 3.0) // 8
    println(resultado)

    println()

    resultado = Math.pow(3.141592F.toDouble(), 1.4142)
    println(resultado)
}
