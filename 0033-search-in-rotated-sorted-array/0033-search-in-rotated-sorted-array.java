class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int pivot = findPivot(nums, n);

        int result;
        if(pivot == -1) result = binarySearch(nums, target, 0, n - 1);
        else{
            if(nums[pivot] == target) return pivot;
            else if(target >= nums[0]) result = binarySearch(nums, target, 0, pivot - 1);
            else result = binarySearch(nums, target, pivot + 1, n - 1);
        }
        return result;
    }

    int findPivot(int[] nums, int n){
        int start = 0, end = n - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if((mid < end) && (nums[mid] > nums[mid + 1])) return mid;
            else if((start < mid) && (nums[mid] < nums[mid - 1])) return mid - 1;

            else if(nums[start] <= nums[mid]) start = mid + 1;
            else if(nums[start] > nums[mid]) end = mid - 1;
        }
        return -1;
    }

    int binarySearch(int[] nums, int target, int low, int high){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}