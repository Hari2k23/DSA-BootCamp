import java.util.Arrays;

public class BinarySearch2DArrays{
    public static void main(String[] args){
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 35;
        int[] result = binarySearch(arr, target);
        System.out.println(Arrays.toString(result));
    }

    // O(nlogn)
    static int[] binarySearch(int[][] arr, int target){
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            int m = arr[i].length;
            int low = 0, high = m - 1;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(arr[i][mid] == target) return new int[]{i, mid};
                else if(arr[i][mid] > target) high = mid - 1;
                else low = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}