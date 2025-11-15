fun main() {
    factorialOfNumber(4)
    println(factorialOfNumber2(3))
}

private fun factorialOfNumber(number: Int) {
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    println(result)
}

private fun factorialOfNumber2(number: Int): Int {
    if (number == 1) {
        return number
    }
    return number * factorialOfNumber2(number - 1)
}