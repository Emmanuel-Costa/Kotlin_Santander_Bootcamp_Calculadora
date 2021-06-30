import kotlin.math.pow

fun main() {
    val y: Float? = 55.0F
    val i: Float = y ?: 0F
    val z: Float? = 78.0F
    val x: Float = z ?: 0F
    if (i != 0F && x != 0F) {
        val operator = 5
        when (operator) {
            0 -> println(x + i)             // adição
            1 -> println(x - i)             // subtração
            2 -> println(x * i)             // multiplicação
            3 -> println(x / i)             // divisão
            4 -> println(x % i)             // resto da divisão
            5 -> println(x.pow(i))          // exponenciação
            else -> println((x / 100) * i)  // porcentagem
        }

    } else {
        println("Número fornecido é indefinido.")
    }
}