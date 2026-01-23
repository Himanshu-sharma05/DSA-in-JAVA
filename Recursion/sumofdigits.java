package Recursion;

public class sumofdigits {
    public static void main(String[] args) {
        int ans = sum(489);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n%10 == n){
            return n;
        }
        return sum(n/10) + n%10;
    }
}
