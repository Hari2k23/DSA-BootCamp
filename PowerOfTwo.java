public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(rightShift(n) == 1 ? "Power of 2" : "Not a Power of 2");
        System.out.println(n != 0 ? (formulaNminus1(n) == 0 ? "Power of 2" : "Not a Power of 2"): "Not a Power of 2");      
    }   

    static int rightShift(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1) count++;
            n = n >> 1;
        }
        return count;
    }

    static int formulaNminus1(int n){
        return n & (n - 1);
    }
}