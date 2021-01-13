package ejercicio034

// Ejercicio 34: Crear una expresión con la sentencia when para retornar una valor desde una función.

fun asignar(objeto: Any): Any {
    val resultado = when (objeto) {
        1 -> "Uno"
        "Kotlin" -> 11
        is Long -> 10L
        else -> false
    }

    return resultado
}

class MiClase

fun main() {
    println(asignar(20L))   // 10

    println(asignar("kotlin"))  // false

    println(asignar("Kotlin"))  // 11

    println(asignar(MiClase())) // false
}
