package arrayAndRangeEtc

fun main() {
    val nullVar : Boolean? = null
    val nullStr : String? = null

    println(nullVar)
    println(nullStr?.length ?: "Empty variable.")
    // if you want to get an error then...
    //println(nullStr!!.length)

    // Int variable type can't store null
    // so if you want to store null in it
    // then you should make it "Int?"
    var myNum : Int?
    myNum = 3
    println(myNum)
    myNum = null
    println("The length of a null variable is ${myNum.toString().length}")
}
