package com.adriano.introducao_1

fun printMessage(message: String): Unit {  // :Unit retorno da funcao, equivalente ao void no Java
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // prefix possui um valor padrao, caso nao seja atribuido um valor para o mesmo na chamad na funcao
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}
//Funcoes com parametros do tipo vararg

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}
//printAll("Hello", "Hallo", "Salut", "Hola", "你好")

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}
//printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "你好", prefix = "Greeting: ")

fun log(vararg entries: String) {
    printAll(*entries)
}


