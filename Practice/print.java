public class print {
    public static void recursion(int n, String scorce, String helper, String destination) {
        if (n == 1) {
            System.out.println(n + " from " + scorce + " to " + destination);
            return;
        }
        recursion(n - 1, scorce, destination, helper);
        System.out.println(n + " from " + scorce + " to " + destination);
        recursion(n - 1, helper, scorce, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        recursion(n, "scorce", "helper", "destination");
    }
}