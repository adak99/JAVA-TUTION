public class print {

    public static void printOriginalArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void modifyMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0 || j == 0 || i == arr.length - 1 || j == arr.length - 1)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Print original array: ");
        printOriginalArray(arr);
        System.out.println("Print modify array: ");
        modifyMatrix(arr);
    }
}