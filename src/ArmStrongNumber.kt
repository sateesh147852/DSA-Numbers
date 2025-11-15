fun main() {
    isArmStrongNumber(372)
}

private fun isArmStrongNumber(number: Int) {
    val digitCount = getCountOfDigits(number)
    var temp = number
    var result = 0
    while (temp > 0) {
        result += getPower(digitCount, temp % 10)
        temp /= 10
    }
    if (result == number) {
        println("The GIven number is ArmStrong Number")
    } else {
        println("The GIven number is not ArmStrong Number")
    }
}

private fun getCountOfDigits(number: Int): Int {
    var count = 0
    var temp = number
    while (temp > 0) {
        count++
        temp /= 10
    }
    return count
}

private fun getPower(power: Int, number: Int): Int {
    var temp = power
    var result = 1
    while (temp > 0) {
        result *= number
        temp--
    }
    return result
}