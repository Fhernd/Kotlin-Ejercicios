package ejercicio027

// Ejercicio 27: Crear una clase para representar una entidad del mundo real.

class Computador(var id: Int, var marca: String, var cpu: String, var ram: Int, var ssd: Int)

fun main() {
    var computadorGamer: Computador
    computadorGamer = Computador(1001, "MSi", "Intel Core i7", 32, 720)

    println(computadorGamer.id)
    println(computadorGamer.marca)
    println(computadorGamer.cpu)
    println(computadorGamer.ram)
    println(computadorGamer.ssd)
}
