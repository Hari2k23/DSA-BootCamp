import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 4, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j - 1] > arr[j]) swap(arr, j - 1, j);
                else break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}