import java.util.*

object Armstrong {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val inp = input.nextInt()
        val ans = IsArmstrong(inp)
        println(ans)
        for (i in 0..999) {
            if (IsArmstrong(i)) {
                println("$i ")
            }
        }
    }

    fun IsArmstrong(inp: Int): Boolean {
        var inp = inp
        val num = inp
        var sum = 0
        while (inp > 0) {
            val remain = inp % 10
            inp = inp / 10
            sum = sum + remain * remain * remain
        }
        return sum == num
    }
}