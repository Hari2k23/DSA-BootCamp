public class Palindrome {
    public static void main(String[] args) {
        int n = 1234321;
        System.out.println(n == Reverse.reverse2(n));
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n){
        String s = Integer.toString(n);
        return helper(s, 0, s.length() - 1);
    }
    private static boolean helper(String s, int i, int j){
        if(i > j) return true;
        if(s.charAt(i) != s.charAt(j)) return false;

        return helper(s, i + 1, j - 1);
    }
}