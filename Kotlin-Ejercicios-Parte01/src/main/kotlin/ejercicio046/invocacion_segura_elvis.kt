package ejercicio046

// Ejercicio 46: Usar el operador Elvis para asegurar el acceso a propiedades nulas.

// ?:

class Persona(val primerNombre: String, val segundoNombre: String?, val primerApellido: String)

fun main() {
    val julio = Persona("Julio", null, "Pérez")

    val alexander = Persona("Alexander", "Iván", "Robledo")

    var cantidadCaracteres = julio.segundoNombre?.length ?: 0
    println(cantidadCaracteres) // 0

    println()

    cantidadCaracteres = alexander.segundoNombre?.length ?: 0
    println(cantidadCaracteres)
}
