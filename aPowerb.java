public class aPowerb {
    public static void main(String[] args) {
        int base = 2, power = 7;

        int answer = 1;
        while(power > 0){
            if((power & 1) == 1) answer = answer * base;
            base *= base;
            power = power >> 1;
        }
        System.out.println(answer);
    }   
}