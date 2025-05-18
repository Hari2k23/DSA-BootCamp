class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        for(int i : nums){
            start = Math.max(start, i);
            end += i;
        }

        while(start < end){
            int mid = start + (end - start)/2;
            
            int pieces = 1;
            int sum = 0;
            for(int i : nums){
                if(sum + i <= mid){
                    sum += i;
                }  
                else{
                    sum = i;
                    pieces++;
                }
            }

            if(pieces <= k) end = mid;
            else start = mid + 1;
        }
        return start;
    }
}