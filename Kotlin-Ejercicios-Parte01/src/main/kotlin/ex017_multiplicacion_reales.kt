// Ejercicio 17: Crear una función para multiplicar dos números reales y retornar el resultado.

fun multiplicar(a: Double, b: Double) : Double {
    return a * b
}

fun main() {
    println("El resultado de multiplicar 3 por 5 es igual ${multiplicar(3.0, 5.0)}")

    println()

    println("El resultado de multiplicar 3 por -5 es igual ${multiplicar(3.0, -5.0)}")
}
