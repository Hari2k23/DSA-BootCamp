import java.util.Arrays;
public class OGBinarySearch2D {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}, 
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 7;
        int[] result = search(mat, target);
        System.out.println(Arrays.toString(result));
    }

    // O(logn + logm)
    static int[] search(int[][] mat, int target){
        int rows = mat.length;
        int cols = mat[0].length;

        if(cols == 0) return new int[]{-1, -1};
        if(rows == 1) return binarySearch(mat, target, rows - 1, 0, cols);

        int cMid = cols / 2;

        int rStart = 0, rEnd = rows - 1;
        while(rStart < rEnd - 1){
            int rMid = rStart + (rEnd - rStart)/2;
            if(mat[rMid][cMid] == target) return new int[]{rMid, cMid};
            else if(mat[rMid][cMid] > target) rEnd = rMid;
            else if(mat[rMid][cMid] < target) rStart = rMid;
        }

        if(target <= mat[rStart][cMid - 1]) return binarySearch(mat, target, rStart, 0, cMid - 1);
        if(target >= mat[rStart][cMid + 1] && target <= mat[rStart][cols - 1]) return binarySearch(mat, target, rStart, cMid, cols - 1);
        if(target <= mat[rStart + 1][cMid - 1]) return binarySearch(mat, target, rStart + 1, 0, cMid - 1);
        if(target >= mat[rStart + 1][cMid + 1]) return binarySearch(mat, target, rStart + 1, cMid + 1, cols - 1); 

        return new int[]{-1, -1};
    }

    static int[] binarySearch(int[][] mat, int target, int row, int low, int high){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mat[row][mid] == target) return new int[]{row, mid};
            else if(mat[row][mid] > target) high = mid - 1;
            else if(mat[row][mid] < target) low = mid + 1;
        }
        return new int[]{-1, -1};
    }
}