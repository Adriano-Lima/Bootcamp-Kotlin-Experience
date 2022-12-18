package desafio.mediafinalaluno

fun main() {
    try {
        val media = readLine()?.toDouble()
        media?.let {
            println(avaliarMedia(media))
        }
    }catch (e: NumberFormatException){
        println("Digite um numero")
    }
}

fun avaliarMedia(media: Double): String {
    return when {
        media < 5 -> "REP"
        media >= 5 && media < 7 -> "REC"
        else -> "APR"
    }
}
