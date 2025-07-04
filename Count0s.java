public class Count0s {
    public static void main(String[] args) {
        int n = 1230079000;
        int c0 = countZeroes(n, 0);
        System.out.println(c0);
    }

    public static int countZeroes(int n, int count){
        if(n == 0) return count;

        if(n % 10 == 0) return countZeroes(n / 10, count + 1);
        return countZeroes(n / 10, count);
    }
}