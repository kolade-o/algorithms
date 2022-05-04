import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        solution(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void solution(int[] arr) {
        for (int gap = arr.length / 2; gap >= 1; gap /= 2) {
            for (int i = gap; i < arr.length; i += gap) {
                int newElem = arr[i];

                int j;
                for (j = i; j >= gap && arr[j - gap] > newElem; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = newElem;
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}