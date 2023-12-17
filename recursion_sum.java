public class recursion_sum {

    int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {

        recursion_sum r = new recursion_sum();

        int result = r.add(1, 2);
        System.out.println("Answer:- " + result);
    }
}
