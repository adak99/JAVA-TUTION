public class print {
    public static void printFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(" " + c);
        printFibo(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        int n = 7;
        printFibo(a, b, n - 2);
    }
}