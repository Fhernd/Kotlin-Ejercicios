package ejercicio039

// Ejercicio 39: Explicar y demostrar el uso de un ciclo do while indeterminado.

import kotlin.random.Random

fun main() {
    do {
        var aleatorio = Random(System.nanoTime()).nextInt(1, 10)

        println("El valor aleatorio generado es: $aleatorio")

        println()

        if (aleatorio == 5) {
            break
        }
    } while (true)
}
