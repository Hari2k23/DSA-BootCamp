import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 4, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            boolean swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}