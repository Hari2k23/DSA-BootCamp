/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        int peak = findPeak(mountainArr, n);

        int index;
        index = binarySearch(mountainArr, target, 0, peak);
        if(index == -1) index = binarySearch(mountainArr, target, peak + 1, n - 1);
        return index;
    }

    int findPeak(MountainArray arr, int n){
        int low = 0, high = n - 1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(arr.get(mid) > arr.get(mid + 1)) high = mid;
            else if(arr.get(mid) < arr.get(mid + 1)) low = mid + 1;
        }
        return high;
    }

    int binarySearch(MountainArray arr, int target, int low, int high){
        boolean isIncreasing = arr.get(low) < arr.get(high);

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr.get(mid) == target) return mid;

            if(isIncreasing){
                if(arr.get(mid) > target) high = mid - 1;
                else if(arr.get(mid) < target) low = mid + 1;
            }
            else{
                if(arr.get(mid) < target) high = mid - 1;
                else if(arr.get(mid) > target) low = mid + 1;
            }
        }
        return -1;
    }
}