public class ProductOfDigits {
    public static void main(String[] args) {
        int N = 13042;
        int prod = digitProduct(N);
        System.out.println(prod);
    }

    public static int digitProduct(int n){
        if(n < 10) return n;

        return (n % 10) * digitProduct(n / 10);
    }
}