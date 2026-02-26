package Searching;
public class Cookies {
    public static void main(String[] args) {
        int[] cookies = {8,15,10,20,8};
        int k = 2;
        int ans = searchAns(cookies, k);
        System.out.println(ans);
    }
    static int distributeCookies(int[] cookies, int k) {
        int ans = searchAns(cookies,k);
        return ans;
    }
    static int[] findRange(int[] nums){
        int max = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(max<=nums[i]){
                max = nums[i];
            }
            sum += nums[i];
        }
        return new int[]{max,sum};
    }
    static int searchAns(int[] nums,int k){
        int[] range = findRange(nums);
        int start = range[0];
        int end = range[1];
        while(start<end){
            int sum = 0;
            int count = 1;
            int mid = start + (end-start)/2;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(i==j){
                        continue;
                    }
                    if(nums[j] + nums[i] > mid){
                        sum = nums[i] + nums[j];
                    count++;
                }else{
                    sum += nums[i];
                }


                if(count > k){
                start = mid+1;
            }
            else{
                end = mid;
            }


                }
                
            }
            
        }
        return end;
    }
}
