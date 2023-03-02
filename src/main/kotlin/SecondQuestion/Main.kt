package SecondQuestion

fun main() {
    val numb = readLine()?.toInt() ?: 0

    var a = 0
    var b = 1
    var c = 0
    var isFibonacci = false

    while (c <= numb) {
        if (c == numb) {
            isFibonacci = true
            break
        }

        c = a + b
        a = b
        b = c
    }

    if (isFibonacci) {
        println("$numb pertence à sequência de Fibonacci")
    } else {
        println("$numb não pertence à sequência de Fibonacci")
    }
}
