fun main() {
    countEvenNumbers()
}

private fun countEvenNumbers() {

    var count = 0
    for (i in 1..100) {
        if (i % 2 == 0) {
            count++
        }
     }
    println("Total even numbers are $count")
}