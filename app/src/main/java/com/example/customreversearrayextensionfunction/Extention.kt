package com.example.customreversearrayextensionfunction

/**
 * Reverses the items after the incoming index
 *
 * If index is not exist the default is 0
 */
fun <T> Array<T>.reverseArrayFromIndex(index: Int = 0){

    /**
     * MidPoint calculates how many times the function will run
     *
     * reverseIndex is last element of array
     */
    val midPoint = ((size - index) / 2) - 1
    var reverseIndex = lastIndex
    var tmpIndex = index

    /**
     * This part reverses array using index.
     */
    for (i in 0..midPoint) {
        val tmp = this[tmpIndex]
        this[tmpIndex] = this[reverseIndex]
        this[reverseIndex] = tmp
        tmpIndex++
        reverseIndex--
        if (tmpIndex >= size - 1) {
            break
        }
    }
}

fun main() {
    val arr: Array<Int?> = arrayOf(1, 2, 3, 4, 5, 6)
    /**
     * Call the custom function with index
     */
    arr.reverseArrayFromIndex(2)

    println(arr.contentToString())
    /**
     * expected out is [1, 2, 6, 5, 4, 3]
     */
}