/**
 * Calculates Fib(n) recursively.
 * CSC 349 sample submission, Summer '17
 */

public class Fibonacci
{
    public static void main(String[] args) {
        System.out.println(fib(Integer.parseInt(args[0])));
    }

    public static int fib(int n) {
        if (n < 0) {
            return -1;
        }
        else if (n == 0 || n == 1) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
