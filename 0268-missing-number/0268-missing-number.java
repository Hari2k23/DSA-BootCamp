class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int i = 0;
        while(i < n){
            int correctIndex = nums[i];
            if(nums[i] != n && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }

        for(i = 0; i < n; i++){
            if(nums[i] != i) return i;
        }

        return n;
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}