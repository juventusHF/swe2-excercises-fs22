package ch.juventus.recursion;

public class FibonacciExample {

    public static void main(String[] args) {
        long startIterative = System.currentTimeMillis();
        int fibResultIterative = fibonacciIterative(40);
        long endIterative = System.currentTimeMillis();
        long durationIterative = endIterative - startIterative;
        System.out.println("Fibonacci called with 40 iterative took " + durationIterative + "ms. Result: " + fibResultIterative);

        long startRecursive = System.currentTimeMillis();
        int fibResultRecursive = fibonacciRecursive(40);
        long endRecursive = System.currentTimeMillis();
        long durationRecursive = endRecursive - startRecursive;
        System.out.println("Fibonacci called with 40 recursive took " + durationRecursive + "ms. Result: " + fibResultRecursive);
    }

    private static int fibonacciIterative(int n) {
        int fib = 0;
        int prev = 1;
        for (int i = 0; i < n; i++) {
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }

    private static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n-2) + fibonacciRecursive(n-1);
        }
    }

}
