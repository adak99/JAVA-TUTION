public class print { // recursion
    public static int printNumebr(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int factNumber = printNumebr(n - 1);
        int factResult = n * factNumber;
        return factResult;
    }

    public static void main(String[] args) {
        System.out.println(printNumebr(5));
    }
}