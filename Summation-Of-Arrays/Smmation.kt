import java.util.*

object Smmation {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        print("Enter first Array: ")
        val n = input.nextInt()
        print("Enter second Array: ")
        val m = input.nextInt()
        var sum = 0
        val nums = Array(10) { IntArray(10) }
        for (i in 0 until n) for (j in 0 until m) nums[i][j] = (i + 1) * (j + 1)
        for (x in nums) {
            for (y in x) {
                println("Values are : $y")
                sum += y
            }
        }
        println("Summation of all values is : $sum")
    }
}