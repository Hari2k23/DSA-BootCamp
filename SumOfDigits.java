public class SumOfDigits {
    public static void main(String[] args) {
        int N = 1342;
        int digits = digitSum(N);
        System.out.println(digits);
    }

    public static int digitSum(int n){
        if(n < 10) return n;

        return (n % 10) + digitSum(n / 10);
    }
}