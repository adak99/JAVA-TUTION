public class recursion {

    int cal(int a) {

        if (a == 1) {
            return 1;
        } else {
            return a * cal(a - 1);
        }
    }

    public static void main(String[] args) {

        recursion p = new recursion();

        int result = p.cal(8);
        System.out.println(result);
    }
}
