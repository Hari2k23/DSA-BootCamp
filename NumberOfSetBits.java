public class NumberOfSetBits{
    public static void main(String[] args) {
        int n = 197;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(rightShift(n));
        System.out.println(negativeN(n));
        System.out.println(nMinus1(n));
    }

    static int rightShift(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1) count++;
            n = n >> 1;
        }
        return count;
    }

    static int negativeN(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n - (n & (-n));
        }
        return count;
    }

    static int nMinus1(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}