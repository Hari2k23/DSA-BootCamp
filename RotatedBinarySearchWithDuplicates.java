public class RotatedBinarySearchWithDuplicates {
    public static void main(String[] args){
        int[] arr = {4, 5, 6, 7, 0, 1, 3};
        int target = 5;
        
        int pivot = findPivot(arr);
        int result;
        if(pivot == -1) result = binarySearch(arr, target, 0, arr.length -1);
        else{
            if(arr[pivot] == target) result = pivot;
            else if(arr[0] <= target) result = binarySearch(arr, target, 0, pivot - 1);
            else result = binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
        System.out.println(result);
    }

    static int findPivot(int[] arr){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid < high && arr[mid] > arr[mid + 1]) return mid;
            else if(low < mid && arr[mid - 1] > arr[mid]) return mid - 1;

            else if(arr[low] == arr[mid] && arr[high] == arr[mid]){
                if(low < high && arr[low] > arr[low + 1]) return low;
                low++;
                if(low < high && arr[high - 1] > arr[high]) return high - 1;
                high--;
            }

            else if((arr[low] < arr[mid]) || (arr[low] == arr[mid] && arr[mid] > arr[high])){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return -1;
    }    

    static int binarySearch(int[] arr, int target, int low, int high){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}