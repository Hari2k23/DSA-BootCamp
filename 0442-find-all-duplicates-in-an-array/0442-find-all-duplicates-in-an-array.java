class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        
        int i = 0;
        while(i < n){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(i = 0; i < n; i++){
            if(nums[i] != i + 1) arr.add(nums[i]);
        }
        return arr;
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;         
    }
}