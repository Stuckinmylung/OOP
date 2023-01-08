package BTVN_T4;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciCal(10));
    }

    public static int fibonacciCal(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciCal(n - 1) + fibonacciCal(n - 2);
    }
}
