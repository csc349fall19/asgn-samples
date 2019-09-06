/**
 * Calculates Fib(n) recursively.
 * CSC 349 sample submission, Winter '19
 */

fun main(args: Array<String>) {
    fun fib(n: Int): Int {
        return when {
            n < 0     -> -1
            n in 0..1 -> n
            else      -> fib(n - 1) + fib(n - 2)
        }
    }

    println(fib(args[0].toInt()))
}
