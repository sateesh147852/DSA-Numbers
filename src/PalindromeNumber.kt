fun main() {
    palindromeNumber(11)
}

private fun palindromeNumber(number: Int) {
    var temp = number
    var reversedNumber = 0
    while (temp > 0) {
        reversedNumber = reversedNumber * 10 + temp % 10
        temp /= 10

    }
    if (reversedNumber == number) {
        println("The given number is palindrome")
    } else {
        println("The given number is not a palindrome")
    }
}