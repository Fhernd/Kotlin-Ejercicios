package ejercicio024

// Ejercicio 24: Asignar un valor a una variable según la evaluación de una condición (usar sentencia if).

fun main() {
    val numero: Int

    val nombre = "Miguel"

    if (nombre.equals("Miguel")) {
        numero = 1000
    } else {
        numero = 500
    }


    println("El valor de la variable numero es: $numero")
}
