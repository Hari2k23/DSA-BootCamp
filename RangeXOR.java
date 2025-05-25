public class RangeXOR {
    public static void main(String[] args) {
        int a = 3, b = 9;
        System.out.println(XOR(b) ^ XOR(a - 1));
    }

    static int XOR(int n){
        if(n % 4 == 0) return n;
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n + 1;
        if(n % 4 == 3) return 0;

        return -1;
    }
}