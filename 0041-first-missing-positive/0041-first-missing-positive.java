class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        int i = 0;
        while(i < n){
            int correctIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i] < n && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }

        for(i = 0; i < n; i++){
            if(nums[i] != i + 1) return i + 1;
        }
        return n + 1;
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}