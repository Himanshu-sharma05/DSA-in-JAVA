package Maths;
public class Practice {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        return sum;
        
    }
}