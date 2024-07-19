import java.util.HashSet;
import java.util.Set;

public class print {
    public static int deleteDuplicate(int arr[], int arrSize) {
        if (arrSize <= 1)
            return arrSize;

        Set<Integer> unicqElement = new HashSet<>();

        for (int i = 0; i < arrSize; i++)
            unicqElement.add(arr[i]);

        int index = 0;
        for (int element : unicqElement)
            arr[index++] = element;

        return unicqElement.size();

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2, 2, 3, 4 };
        int arrSize = arr.length;

        arrSize = deleteDuplicate(arr, arrSize);

        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
