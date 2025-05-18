public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 14;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        
        int low = 0, high = n - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) low = mid + 1;
            else if(arr[mid] > target) high = mid - 1;
        }

        return -1;
    }
}
