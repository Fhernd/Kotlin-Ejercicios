package ejercicio030

// Ejercicio 30: Crear una jerarquía de herencia usando la palabra clave open.

open class Vehiculo {
    open fun iniciar() {
        println("El vehículo se ha iniciado.")
    }
}

class Bicileta : Vehiculo() {
    override fun iniciar() {
        super.iniciar()

        println("La bicicleta se ha iniciado.")
    }
}

fun main() {
    val bicicletaRoja: Vehiculo = Bicileta()

    bicicletaRoja.iniciar()
}
