public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 10, base = 2;

        System.out.println(rightShift(n));
        System.out.println(formula(n, 10));
    }

    static int rightShift(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n >> 1;
        }
        return count;
    }

    static int formula(int n, int b){
        return (int)(Math.log(n) / Math.log(b)) + 1;
    }
}