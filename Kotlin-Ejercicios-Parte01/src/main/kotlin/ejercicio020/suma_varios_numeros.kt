package ejercicio020

// Ejercicio 20: Definir una función personalizada para sumar varios valores (usar vararg).

fun sumarValores(vararg valores : Double) : Double {
    var suma = 0.0

    for (v in valores) {
        suma += v
    }

    return suma
}

fun main() {
    println(sumarValores(1.0, 2.0, 3.0, 4.0, 5.0))  // 15

    println()

    println(sumarValores(1.0, 2.0, 3.0))  // 6

    println()

    println(sumarValores(1.0))  // 0
}
