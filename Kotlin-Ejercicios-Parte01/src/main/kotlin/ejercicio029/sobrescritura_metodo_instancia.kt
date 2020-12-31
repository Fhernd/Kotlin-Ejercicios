package ejercicio029

// Ejercicio 29: Sobrescribir el método de instancia toString() de una clase personalizada.

class Computador (var id: Int, var marca: String, var cpu: String, var ram: Int, var ssd: Int) {
    override fun toString() = "ID: $id - Marca: $marca - CPU: $cpu - RAM: $ram - SSD: $ssd"
}

fun main() {
    var computadorGamer = Computador(1001, "MSi", "Intel Core i7", 32, 720)

    // Antes:
    // ejercicio029.Computador@28d93b30

    println(computadorGamer)

    // Después:
    // ID: 1001 - Marca: MSi - CPU: Intel Core i7 - RAM: 32 - SSD: 720
}
