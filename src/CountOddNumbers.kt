fun main() {
    countOddNumbers()
}

private fun countOddNumbers() {
    var count = 0
    for (i in 1..100) {
        if (i % 2 == 1) {
            count++
        }
    }
    println("Total odd numbers are $count")
}