fun main() {
    printEvenNumbers()
}

private fun printEvenNumbers() {
    for (i in 1..100) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
}