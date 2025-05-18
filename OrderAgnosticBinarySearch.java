public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] arr1 = {2, 3, 5, 9, 14, 16, 18};
        int target1 = 14;
        int result1 = binarySearch(arr1, target1);
        System.out.println(result1);

        int[] arr2 = {18, 16, 14, 9, 5, 3, 2};
        int target2 = 14;
        int result2 = binarySearch(arr2, target2);
        System.out.println(result2);
    }

    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        
        boolean is_increasing = arr[0] < arr[n - 1];

        int low = 0, high = n - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target) return mid;

            if(is_increasing){
                if(arr[mid] < target) low = mid + 1;
                else if(arr[mid] > target) high = mid - 1;
            }
            else{
                if(arr[mid] < target) high = mid - 1;
                else if(arr[mid] > target) low = mid + 1;
            }
        }
        return -1;
    }
}