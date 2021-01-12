package ejercicio031

// Ejercicio 31: Crear una jerarquía de herencia con un constructor parametrizado.

open class Vehiculo(val color: String) {
    fun iniciar() {
        println("El vehiculo se ha iniciado.")
    }
}

class Bicicleta : Vehiculo("Negro") {
    fun parquear() {
        println("La bicicleta se ha parqueado.")
    }
}

fun main() {
    val biciletaNegra: Vehiculo = Bicicleta()
    biciletaNegra.iniciar()

    println()

    (biciletaNegra as Bicicleta).parquear()

    println()

    println(biciletaNegra.color)
}
