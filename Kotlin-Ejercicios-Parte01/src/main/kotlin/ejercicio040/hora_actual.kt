package ejercicio040

// Ejercicio 40: Obtener la hora actual con el método now() de la clase Instant.

import java.time.Instant
import java.time.ZoneId

fun main() {
    val horaActual = Instant.now()
    println(horaActual)

    println()

    val poloSur = horaActual.atZone(ZoneId.of("Antarctica/South_Pole"))
    println(poloSur)
}
