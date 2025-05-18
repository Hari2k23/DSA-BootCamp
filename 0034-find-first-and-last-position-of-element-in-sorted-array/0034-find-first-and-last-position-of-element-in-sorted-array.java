class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        result[0] = binarySearch(nums, target, true);
        if(result[0] != -1) result[1] = binarySearch(nums, target, false);

        return result;
    }

    int binarySearch(int[] nums, int target, boolean firstPosition){
        int n = nums.length;
        int low = 0, high = n - 1;

        int answer = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] > target) high = mid - 1;
            else if(nums[mid] < target) low = mid + 1;
            else{
                answer = mid;
                if(firstPosition) high = mid - 1;
                else low = mid + 1;
            }
        }
        return answer;
    }
}