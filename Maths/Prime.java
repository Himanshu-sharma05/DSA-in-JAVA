package Maths;
public class Prime {
    public static void main(String[] args) {
        int n = 23;
        boolean ans = true;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                ans = false;
            }
        }
        System.out.println(ans);

    }
}
