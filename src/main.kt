import kotlin.math.pow

fun main() {
    val y: Float? = 55.0F
    val z: Float? = 78.0F

    if (y != null && z != null) {
        val operator = 5
        when (operator) {
            0 -> println(y + z)             // adição
            1 -> println(y - z)             // subtração
            2 -> println(y * z)             // multiplicação
            3 -> println(y / z)             // divisão
            4 -> println(y % z)             // resto da divisão
            5 -> println(y.pow(z))          // exponenciação
            else -> println((y / 100) * z)  // porcentagem
        }

    } else {
        println("Número fornecido é indefinido.")
    }
}