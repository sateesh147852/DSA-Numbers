fun main() {
    reverseNumber(123101)
}

private fun reverseNumber(number: Int) {
    var temp = number
    var reversedNumber = 0
    while (temp > 0) {
        reversedNumber = reversedNumber *  10 + temp % 10
        temp /= 10
    }
    println(reversedNumber)
}