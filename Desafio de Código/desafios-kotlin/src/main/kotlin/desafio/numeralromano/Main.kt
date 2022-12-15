package desafio.numeralromano

fun main() {
    val numeroRomano: String? = readLine()

    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var resultado = 0
    numeroRomano?.let {
        var i = 0
        while (i < numeroRomano.length) {
            val atual = numerosRomanos.getValue(numeroRomano[i])
            val proximo = when (i + 1) {
                numeroRomano.length -> 0
                else -> numerosRomanos.getValue(numeroRomano[i + 1])
            }
            if (proximo > atual) {
                resultado += (proximo - atual)
                i+=2
            } else {
                resultado += atual;
                i++
            }
        }
        print(resultado)
    }
}