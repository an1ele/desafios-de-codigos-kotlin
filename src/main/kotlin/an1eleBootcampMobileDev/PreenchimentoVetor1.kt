// Abaixo segue um exemplo de código que você pode ou não utilizar

fun main(args: Array<String>) {
    val v = readLine()!!.toInt()
    val a = IntArray(10).toMutableList()

// preenchendo a lista de array

    for (i in 0 until 10 ) {
        a[i] = if(i == 0) {
            v
        }
        else a[i-1] * 2 // dobro do valor da posição anterior
    }
    for (k in 0 until 10 ) { println("N[$k] = ${a[k]}") }
}
