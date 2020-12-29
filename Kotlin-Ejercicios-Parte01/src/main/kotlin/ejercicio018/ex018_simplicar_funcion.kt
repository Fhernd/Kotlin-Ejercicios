// Ejercicio 18: Simplificar la definición de una función que contiene una única instrucción.

package ejercicio018

fun multiplicar(a: Double, b: Double) = a * b

fun main() {
    println("El resultado de multiplicar 3 por 5 es igual ${multiplicar(3.0, 5.0)}")

    println()

    println("El resultado de multiplicar 3 por -5 es igual ${multiplicar(3.0, -5.0)}")
}
