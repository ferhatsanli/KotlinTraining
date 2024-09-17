package arrayAndRangeEtc

fun main() {
    val myNums = 13..43
    val myLetters = 'f'..'s'

    val revNums = 35..5
    val revLets = 'z'..'d'

    val numRangeTo = 3.rangeTo(13)
    val numDownTo = 13.downTo(5)

    val decimalRange = 100000.rangeTo(10).step(10)
    val someOdds = 1.rangeTo(13).step(2)

    var isInTheRange : Boolean = 13 in someOdds
    println("13 is${if (isInTheRange) "" else " not"} in the range of someOdds variable.")

    println(decimalRange.first)
}