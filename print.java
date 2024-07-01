public class print {
    public static void main(String[] args) {
        // print factorial of a number
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = i * fact;
        }
        System.out.println(fact);
    }
}