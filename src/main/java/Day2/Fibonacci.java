package Day2;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacciFor(45));
        System.out.println(fibonacciRecursion(45));

    }

    public static double fibonacciRecursion(int n) {

        if(n == 1 || n == 2) {

            return 1;

        }

        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);

    }

    public static double fibonacciFor(int n) {

        if(n == 1 || n == 2) {

            return 1;

        }
        double a = 0;
        double b = 1;
        double c = 0;

        for (int i = 1; i < n; i++) {

            c = a + b;
            a = b;
            b = c;

        }
        return c;
    }

}
