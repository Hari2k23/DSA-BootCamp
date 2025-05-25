public class ResetithBit {
    public static void main(String[] args) {
        int n = 86;
        int i = 5;
        int mask = ~(1 << (i - 1));
        n = n & mask;
        System.out.println(n);
    }
}