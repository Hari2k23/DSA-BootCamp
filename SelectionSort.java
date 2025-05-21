import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 4, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr){
            int n = arr.length;
            for(int i = 0; i < n; i++){
                int last = n - i - 1;
                int maxIndex = getMaxIndex(arr, 0, last);
                swap(arr, maxIndex, last);
            }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int maxi = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[maxi]) maxi = i;
        }
        return maxi;
    }
}