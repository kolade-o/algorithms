import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // 6
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        solution(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void solution(int[] arr) {

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for (int j = 1; j <= lastUnsortedIndex; j++) {
                if (arr[j] > arr[largestIndex]) {
                    largestIndex = j;
                }
            }

            swap(arr, lastUnsortedIndex, largestIndex);
        }
    }

    private static void swap(int[] arr, int i, int j){
        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}