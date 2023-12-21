public class fibonacci_recursion {

    static void printFiboSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    static int fibo(int n) {

        if (n <= 1)
            return n;
        else
            return (fibo(n - 1) + fibo(n - 2));
    }

    public static void main(String[] args) {
        int numberOfTerams = 5;
        System.out.print("Fibonacci Series: ");
        printFiboSeries(numberOfTerams);

    }
}