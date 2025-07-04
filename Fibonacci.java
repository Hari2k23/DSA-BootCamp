public class Fibonacci {
    public static void main(String[] args) {
        int result = fibo(7);
        System.out.println(result);

        for(int i = 0; i <= 10; i++) System.out.println(fiboFormula(i));
        System.out.println(fiboFormula(50));
    }

    static int fibo(int n){
        if(n == 0 || n == 1) return n;

        return fibo(n - 1) + fibo(n - 2);
    }

    static long fiboFormula(long n){
        return (long)((Math.pow((1 + Math.sqrt(5))/2, n) - Math.pow((1 - Math.sqrt(5))/2, n))/Math.sqrt(5));
    }
}