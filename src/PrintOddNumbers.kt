fun main() {
    printOddNumbers()
}

private fun printOddNumbers() {
    for (i in 1..100) {
        if (i % 2 == 1) {
            print("$i ")
        }
    }
}