package arrays

fun main() {
    val arr : Array<Int> = arrayOf(1,2,3)
    println("Size: ${arr.size}")

    val anyArr: Array<Any> = arrayOf(29, "ferhat sanli")
    println("My name is ${anyArr[1]}. I'm ${anyArr.get(0)} years old.")

}