package ejercicio028

import java.util.*

// Ejercicio 28: Crear una clase con propiedades (atributos) mutables e inmutables.

class Cliente(val id: Int, val nombre: String, var email: String, var fechaNacimiento: Date, var direccion: String)

fun main() {
    var julio = Cliente(2001, "Julio Pérez", "julio@outlook.com", Date(1983, 5, 23), "Carrera 110")

    println(julio.id)

    println()

    // julio.id = 2002  // No se puede cambiar el valor de la propiedad id

    println(julio.email)

    println()

    julio.email = "julio@gmail.com"

    println(julio.email)
}
