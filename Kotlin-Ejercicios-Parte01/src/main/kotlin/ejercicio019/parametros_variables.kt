package ejercicio019

// Ejercicio 19: Definir una función que permita recibir una cantidad variable de argumentos.

fun imprimirMensajes(vararg mensajes: String) {
    for(m in mensajes) {
        println(m)
    }
}

fun main() {
    imprimirMensajes("Hola", "Buenos días", "Buenas tardes", "Buenas noches")

    println()

    imprimirMensajes("Hola")

    println()

    imprimirMensajes("Hola", "Buenos días")
}
