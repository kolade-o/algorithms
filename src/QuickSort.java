import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // 6
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        solution(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void solution(int[] arr) {
        quickSort(arr, 0, arr.length);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(end - start < 2) return;

        int pivotIndex = partition(arr, start, end);

        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[start];
        int i = start;
        int j = end - 1;

        while (i < j){

        }

        return j;
    }
}