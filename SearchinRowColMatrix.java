import java.util.Arrays;
public class SearchinRowColMatrix {
    public static void main(String[] args){
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 37;
        int[] result = binarySearch(arr, target);
        System.out.println(Arrays.toString(result));
    }

    // O(2n) ~ O(n)
    static int[] binarySearch(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length - 1;

        while(col >= 0 && row < arr.length){
            if(arr[row][col] == target) return new int[]{row, col};
            else if(arr[row][col] > target) col--;
            else if(arr[row][col] < target) row++;
        }
        return new int[]{-1, -1};
    }
}