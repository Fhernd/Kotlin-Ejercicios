package ejercicio022

// Ejercicio 22: Estudiar el mecanismo de inferencia de tipo de dato de una variable.

fun main() {
    val PI: Double = 3.141592

    val E = 2.7172

    var sumaConstantes = PI + E

    println("El contenido de la variable sumaConstantes es igual a $sumaConstantes")

    println()

    var nombre = "Daniela Ortiz"
    println("El contenido de la variable nombre es: $nombre")

    println()

    var angela = Contacto(1001, "angela@mail.co")
    println(angela.email)
    println(angela.id)
}

class Contacto(val id: Int, val email: String)
