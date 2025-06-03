public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println("GCD: " + gcd(10, 18));
        System.out.println("LCM: " + lcm(10, 18));
    }

    static int gcd(int a, int b){
        if(a == 0) return b;

        return gcd(b % a, a);
    }

    static int lcm(int a, int b){
        return (a * b)/gcd(a, b);
    }
}