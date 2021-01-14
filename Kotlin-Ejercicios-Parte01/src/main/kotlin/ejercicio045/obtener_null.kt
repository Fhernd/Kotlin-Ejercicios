package ejercicio045

// Ejercicio 45: Evitar errores al acceder a atributos de una propiedad que sea null.   

class Persona(val primerNombre: String, val segundoNombre: String?, val primerApellido: String)

fun main() {
    val julio = Persona("Julio", null, "Pérez")

    val alexander = Persona("Alexander", "Iván", "Robledo")

    var cantidadCaracteres = julio.segundoNombre?.length

    println(cantidadCaracteres) // null

    println()

    cantidadCaracteres = alexander.segundoNombre?.length

    println(cantidadCaracteres)
}
