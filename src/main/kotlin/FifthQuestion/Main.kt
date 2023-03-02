package FifthQuestion

fun main() {
    val words = "TargetSistemas"
    var invertion = ""

    for (i in words.length - 1 downTo 0) {
        invertion += words[i]
    }

    println(invertion)
}

//A primeiro momento pensei em fazer utilizando a função reversed(), mas depois percebi a recomendação
//e fiz da outra forma sem a função... De qualquer forma, segue abaixo como ficaria:

//  fun main() {
//      val word = "exemplo"
//      val invertion = word.reversed()
//
//      println(invertion)
//  }

