package ejercicio035

// Ejercicio 35: Demostrar el proceso de recorrido (iteración) de una lista con un ciclo for.

fun main() {
    val partesComputador = listOf<String>("Monitor", "CPU", "RAM", "SSD", "Board")

    for (parte in partesComputador) {
        println("La parte actual es: $parte")
    }
}
