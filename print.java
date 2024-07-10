public class print {
    public static void calculation(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        calculation(i + 1, n, sum);
    }

    public static void main(String[] args) {
        calculation(1, 5, 0);
    }
}
