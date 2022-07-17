// Abaixo segue um exemplo de código que você pode ou não utilizar

fun main() {

//TODO: Complete os espaços em branco com uma possível solução para o desafio

    val notas: IntArray = intArrayOf(100, 50, 20, 10, 5, 2, 1)
    var valor = readLine()!!.toInt()
    var qtdNotas:Int
    println(valor)


    for (i in notas.indices) {
        if (valor >= notas[i]) {
            qtdNotas = valor/notas[i]
            println("$qtdNotas nota(s) de R$ " + notas[i] + ",00")
        } else {
            println("0 nota(s) de R$ " + notas[i] + ",00")
        }
        valor %= notas[i]
    }
}

