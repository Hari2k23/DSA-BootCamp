import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 36;
        factors2(n);
    }

    static void factors1(int n){
        for(int i = 1; i*i <= n; i++){
            if(i == n/i) System.out.print(i + " ");
            else if(n % i == 0){
                System.out.println(i + " " + n / i);
            }
        }
    }

    static void factors2(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            if(i == n/i) System.out.print(i + " ");
            else if(n % i == 0){
                System.out.print(i + " ");
                arr.add(n / i);
            }
        }
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(arr.size() - i - 1) + " ");
        }
    }
}