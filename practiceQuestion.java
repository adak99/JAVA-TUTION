public class practiceQuestion {

    static int positive = 0;
    static int negetive = 0;
    static int zero = 0;

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) > 0) {
                positive = positive + 1;
            } else if (Integer.parseInt(args[i]) == 0) {
                zero = zero + 1;
            } else {
                negetive = negetive + 1;
            }
        }
        System.out.println(positive + " Positive number.");
        System.out.println(negetive + " Negetive number.");
        System.out.println(zero + " zero no.");
    }
}
