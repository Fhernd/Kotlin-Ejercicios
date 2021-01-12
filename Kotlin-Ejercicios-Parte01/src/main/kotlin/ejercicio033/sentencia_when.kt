package ejercicio033

// Ejercicio 33: Demostrar el uso básico de la sentencia de casos when.

fun seleccionCaso(objeto: Any) {
    when(objeto) {
        1 -> println("Uno")
        "Kotlin" -> println("Lenguaje de programación Kotlin")
        is Long -> println("Entero de 64 bits")
        !is String -> println("No es una cadena de caracteres (String)")
        else -> println("Desconocido")
    }
}

class MiClase

fun main() {
    seleccionCaso("Kotlin")
    seleccionCaso(123456L)
    seleccionCaso(1.0)
    seleccionCaso(MiClase())
    seleccionCaso(1)
}
