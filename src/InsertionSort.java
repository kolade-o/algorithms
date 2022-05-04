import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        solution(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int newElem = arr[i];

            int j;
            for (j = i; j > 0 && arr[j - 1] > newElem; j--) {
                arr[j] = arr[j - 1];
            }

            arr[j] = newElem;
        }
    }

    private static void swap(int[] arr, int i, int j){
        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}