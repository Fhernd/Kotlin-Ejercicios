package ejercicio044

// Ejercicio 44: Usar un condicional para verificar si una propiedad tiene asignado null.

class Persona(val primerNombre: String, val segundoNombre: String?, val primerApellido: String)

fun main() {
    val julio = Persona("Julio", null, "Pérez")

    val alexander = Persona("Alexander", "Iván", "Robledo")

    if (julio.segundoNombre != null) {
        println(julio.segundoNombre)
    } else {
        println("Julio no tiene segundo nombre.")
    }

    println()

    if (alexander.segundoNombre != null) {
        println(alexander.segundoNombre)
    } else {
        println("Julio no tiene segundo nombre.")
    }
}
