public class print {
    public static void calculation(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(" " + c);
        calculation(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        int n = 5;
        calculation(a, b, n - 2);
    }
}
