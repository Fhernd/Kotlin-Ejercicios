package ejercicio023

// Ejercicio 23: Obtener el tipo de dato de una variable con el operador is.

fun main() {
    var numero = 23

    println(numero is Int)  // true

    println()

    println(numero::class.simpleName)   // Int
    println(numero::class.qualifiedName)    // kotlin.Int

    println()

    if (numero is Int) {
        println("El tipo de dato de la variable numero es Int")
    } else {
        println("El tipo de dato de la variable numero no es Int")
    }
}
