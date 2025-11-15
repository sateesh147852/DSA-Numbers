fun main() {
    isEvenOdd5(101)
}

// Using % operator
private fun isEvenOdd(number: Int) {
    if (number % 2 == 0) {
        println("The given number is even")
    } else {
        println("The given number is odd")
    }
 }

// Using / by operator
private fun isEvenOdd2(number: Int) {
    if ((number / 2) * 2 == number ) {
        println("The given number is even")
    } else {
        println("The given number is odd")
    }
}

// Using & by operator
private fun isEvenOdd3(number: Int) {
    if (number and 1 == 0) {
        println("The given number is even")
    } else {
        println("The given number is odd")
    }
}

// Using | by operator
private fun isEvenOdd4(number: Int) {
    if (number or 1 > number) {
        println("The given number is even")
    } else {
        println("The given number is odd")
    }
}

private fun isEvenOdd5(number: Int) {
    if ((number xor 1) == number + 1) {
        println("The given number is even")
    } else {
        println("The given number is odd")
    }
}



