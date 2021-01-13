package ejercicio041

// Ejercicio 41: Evitar que una variable pueda contener valores nulos en cualquier línea de código.

fun main() {
    var nombre: String

    nombre = "Oliva"

    println(nombre)

    println()

    // nombre = null // Genera error: no se puede asignar null a una variable que no acepta valores de ese tipo.
}
