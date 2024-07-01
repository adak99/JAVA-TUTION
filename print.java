public class print { // recursion
    public static int printNumber(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 1;
        }

        int a = printNumber(x, n - 1);
        int b = x * a;

        return b;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int result = printNumber(x, n);
        System.out.println(result);
    }
}