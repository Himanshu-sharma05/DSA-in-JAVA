package Maths;
public class sqrt {
    public static void main(String[] args) {
        int ans = mySqrt(14);
        System.out.println(ans);
    }
    static int mySqrt(int x) {
        int start = 0;
        int end = x;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid*mid == x){
                return mid;
            }
            if(mid*mid > x){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end;
    }
}
