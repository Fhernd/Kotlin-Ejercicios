package ejercicio036

// Ejercicio 36: Realizar una demostración básica del uso del ciclo while.

fun moverFigura() {
    println("La figura se ha movido.")
}

fun main() {
    var contadorMovimiento = 0

    while (contadorMovimiento < 10) {
        moverFigura()

        ++contadorMovimiento
    }
}
