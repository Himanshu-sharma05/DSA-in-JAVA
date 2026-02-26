package Searching;
import java.util.Arrays;

public class FirstandLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,8,9,9,9,10};
        int target = 15;
        int ans1 = Firsto(arr,target,true);
        int ans2 = Firsto(arr,target,false);
        int[] fin = {-1,-1};
        fin[0] = ans1;
        fin[1] = ans2 - 1 ;
        System.out.println(Arrays.toString(fin));
    }
    static int Firsto(int[] arr,int target,boolean first){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid]<target){
                //potential answer 
                start = mid+1;
            }
            else{
                if(first){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            
            
        }
        return start;
    }
}
