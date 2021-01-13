package ejercicio037

// Ejercicio 37: Demostrar el uso básico de un ciclo while indeterminado.

import kotlin.random.Random

fun main() {
    while (true) {
        var aleatorio = Random(System.nanoTime()).nextInt(1, 10)

        println("El valor aleatorio generado es: $aleatorio")

        println()

        if (aleatorio == 5) {
            break
        }
    }
}
