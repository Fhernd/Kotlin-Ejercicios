package ejercicio038

// Ejercicio 38: Explicar y demostrar el uso básico del ciclo do while.

fun moverFigura() {
    println("La figura se ha movido.")
}

fun main() {
    var contadorMovimiento = 0

    do {
        moverFigura()

        ++contadorMovimiento
    } while (contadorMovimiento < 10)
}
