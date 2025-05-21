class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        int i = 0; 
        while(i < n){
            if(nums[i] != i + 1){
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);
                }
                else return nums[i];
            }
            else i++;
        }

        // for(i = 0; i < n; i++){
        //     if(nums[i] != i + 1) return nums[i];
        // }
        return -1;
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;         
    }
}