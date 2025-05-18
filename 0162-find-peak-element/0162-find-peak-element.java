class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] < nums[mid + 1]) low = mid + 1;
            else if(nums[mid] > nums[mid + 1]) high = mid;
        }
        return low;
    }
}