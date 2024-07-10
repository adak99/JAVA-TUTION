public class print {
    public static int printFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int factNumber = printFactorial(n - 1);
        int result = n * factNumber;
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = printFactorial(n);
        System.out.println(n + " factorial is: " + result);
    }
}