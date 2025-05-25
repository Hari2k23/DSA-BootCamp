public class ithBit {
    public static void main(String[] args) {
        int n = 86;
        int i = 5;

        int mask = 1 << (i - 1);
        System.out.println((n & mask) == 0 ? "0" : "1");
    }
}