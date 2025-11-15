fun main() {
    fibbonacciSeries(10)
}

private fun fibbonacciSeries(number: Int) {
    var a = 0
    var b = 1
    println(a)
    println(b)
    for (i in 2..number) {
        val sum = a + b
        println(sum)
        a = b
        b = sum
    }
}