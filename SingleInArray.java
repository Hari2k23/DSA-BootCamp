public class SingleInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        
        int xor_ = 0;
        for(int i : arr) xor_ ^= i;
        System.out.println(xor_);
    }
}