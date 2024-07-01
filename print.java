public class print { // recursion
    public static void printNumebr(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printNumebr(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumebr(n);
    }
}