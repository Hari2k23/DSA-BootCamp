class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr : image){
            int n = arr.length;
            for(int i = 0; i < (n + 1)/2; i++){
                int temp = arr[i] ^ 1;
                arr[i] = arr[n - i - 1 ] ^ 1;
                arr[ n - i - 1] = temp;
            }
        }
        return image;
    }
}