public class print {
    public static void towerOfHonoi(int n, String scorce, String helper, String destination) {
        if (n == 1) {
            System.out.println(scorce + " " + helper + " " + destination);
            return;
        }

        towerOfHonoi(n - 1, scorce, destination, helper);
        System.out.println(scorce + " " + helper + " " + destination);
        towerOfHonoi(n - 1, helper, scorce, destination);

    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHonoi(n, "scorce", "helper", "destination");
    }

}