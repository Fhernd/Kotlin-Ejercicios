package ejercicio026

// Ejercicio 26: Uso de valores nulos en la especificación de la firma de una función.

fun saludar(saludo: String?) {
    if (saludo != null && saludo.isNotEmpty()) {
        println("$saludo, usuario")
    } else {
        println("Hola, usuario")
    }
}

fun main() {
    saludar("Buenos días")

    println()

    saludar("Buenas tardes")

    println()

    saludar(null)
}
