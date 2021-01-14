package ejercicio043

// Ejercicio 43: Especificar parámetros con valores nulos sobre un constructor de una clase.

class Persona(val primerNombre: String, val segundoNombre: String?, val primerApellido: String)

fun main() {
    val julio = Persona("Julio", null, "Pérez")

    val alexander = Persona("Alexander", "Iván", "Robledo")
}
