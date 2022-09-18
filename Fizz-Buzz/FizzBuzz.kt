import java.util.*

object FizzBuzz {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        println("Enter no. to view FizzBuzz : ")
        val nums = input.nextInt()
        for (i in 1..nums) {
            if (i % 5 == 0 && i % 3 == 0) println("FizzBuzz") else if (i % 5 == 0) println("Buzz") else if (i % 3 == 0) println("Fizz") else println(i)
        }
    }
}