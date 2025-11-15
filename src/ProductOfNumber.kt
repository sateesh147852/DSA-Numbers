fun main() {
    productOfNumber(12340)
}

private fun productOfNumber(number: Int) {
    var temp = number
    var res = 1
    while (temp > 0) {
        res *= temp % 10
        temp /= 10
    }
    println(res)
}