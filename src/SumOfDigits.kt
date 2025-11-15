fun main() {
    sumOfDigits(901)
}

private fun sumOfDigits(number: Int) {
    var temp = number
    var sum = 0
    while (temp > 0) {
        sum += temp % 10
        temp /= 10
    }
    println("Total sum is $sum")
}