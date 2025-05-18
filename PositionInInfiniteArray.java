public class PositionInInfiniteArray {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 6, 8, 10, 11, 12, 14, 15, 20, 23, 105, 200};
        int target = 14;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0, end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        int result = binarySearch(arr, target, start, end);
        return result;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        int low = start, high = end;
        while(low <= high){
            int mid = low + (high -low)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}