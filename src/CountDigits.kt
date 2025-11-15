fun main() {
    countDigitsInNumber(120340)
}

private fun countDigitsInNumber(number: Int) {
    var count = 0
    var temp = number
    while (temp > 0) {
        count++
        temp /= 10
    }
    println("The total count of the number is ${count}")
}