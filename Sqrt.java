public class Sqrt {
    public static void main(String[] args) {
        int n = 20, precision = 3;
        double root = sqrt(n, precision);
        System.out.println(root);
    }

    static double sqrt(int n, int precision){
        int low = 0, high = n;
        while(low < high){
            int mid = low + (high - low)/2;
            if(mid*mid == n) return mid;
            else if(mid*mid < n) low = mid + 1;
            else high = mid - 1;
        }

        double root = low;
        double p = 0.1;
        for(int i = 0; i < precision; i++){
            while(root*root <= n) root += p;
            root -= p;
            
            p /= 10;
        }

        return root;
    }
}