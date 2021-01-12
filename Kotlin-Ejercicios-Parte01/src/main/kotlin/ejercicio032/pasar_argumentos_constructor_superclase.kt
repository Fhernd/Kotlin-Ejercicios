package ejercicio032

// Ejercicio 32: Pasar argumentos al constructor de una superclase de una jerarquía de herencia.

open class Vehiculo(val identificador: String, val color: String, val costo: Double) {
    fun iniciar() {
        println("Identificador: $identificador - Color: $color - Costo: $$costo")
    }
}

class Bicicleta(identificador: String, color: String, costo: Double,val esMontañera: Boolean) : Vehiculo(identificador, color, costo)

fun main() {
    val bicicletaMontañera: Bicicleta = Bicicleta("123456", "Negra", 10000.0, true)

    println(bicicletaMontañera.identificador)
    println(bicicletaMontañera.color)
    println(bicicletaMontañera.costo)
    println(bicicletaMontañera.esMontañera)
}