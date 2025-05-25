public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int base = 5;

        int result = 0;

        int i = 1;
        while(n > 0){
            int last_digit = n & 1;
            n >>= 1;

            // result += last_digit*Math.pow(base, i++);
            result += base*last_digit;
            base *= 5;
        }
        System.out.println(result);
    }
}