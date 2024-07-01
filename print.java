public class print { // array
    public static void printNumebr(int arr[], int n, int temp) {

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };

        printNumebr(arr, arr.length - 1, arr[0]);

        for (int resutl : arr) {
            System.out.println(resutl);
        }

    }
}