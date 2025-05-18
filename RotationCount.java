public class RotationCount {
    public static void main(String[] args){
        int[] arr = {4, 5, 6, 7, 0, 1, 3};
        
        int pivot = findPivot(arr);
        System.out.println("Number of Rotations: " + (pivot + 1));
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
}