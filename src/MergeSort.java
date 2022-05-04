import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // 6
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        solution(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void solution(int[] arr) {
        mergeSort(arr, 0, arr.length);
    }

    private static void mergeHalves(int[] arr, int start, int end, int mid) {
        if(arr[mid - 1] <= arr [mid]) return;

        int[] tempArr = new int[end - start];

        int left = start;
        int right = mid;
        int tempIndex = 0;

        while (left < mid && right < end){
            tempArr[tempIndex++] = arr[left] <= arr[right] ? arr[left++] : arr[right++];
        }

        System.arraycopy(arr, left, arr, start + tempIndex, mid - left);
        System.arraycopy(tempArr, 0, arr, start, tempIndex);
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if((end - start) < 2) return;

        int mid = (end + start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        mergeHalves(arr, start, end, mid);
    }
}