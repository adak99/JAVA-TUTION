public class print {
    public static void reverseStr(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index) + " ");
            return;
        }

        System.out.print(str.charAt(index) + " ");
        reverseStr(str, index - 1);
    }

    public static void main(String[] args) {
        String str = "ABCD";
        reverseStr(str, str.length() - 1);
    }
}