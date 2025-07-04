public class Reverse {
    public static void main(String[] args) {
        int n = 1432;
        System.out.println(reverse1(n));
        System.out.println(reverse2(n));
    }

    static int sum = 0;
    public static int reverse1(int n){
        if(n == 0) return sum;

        sum = sum * 10 + n % 10;
        return reverse1(n / 10);
    }

    public static int reverse2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits){
        if(n == 0) return n;

        return (n % 10)*(int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
}