package LeetCode;
public class MedLeetcode {
    public static void main(String[] args) {
        int[] weights = {1,2,3,1,1};
        int days = 4;
        int ans = shipWithinDays(weights, days);
        System.out.println(ans);
    }
    static int shipWithinDays(int[] weights, int days) {
        int ans = searchAns(weights,days);
        return ans;
    }
    static int[] findRange(int[] nums){
        int max = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(max <= nums[i]){
                max = nums[i];
            }
            sum += nums[i];
        }
        return new int[]{max,sum};
    }

    static int searchAns(int[] nums,int d){
        int[] range = findRange(nums);
        int start = range[0];
        int end = range[1];
        
        while(start < end){
            int mid = start + (end-start)/2;
            int sum = 0;
            int count = 1;
            for(int i=0;i<nums.length;i++){
                if(sum + nums[i] > mid){
                    sum = nums[i];
                    count++;
                }
                else{
                    sum += nums[i];
                }
            }
            if(count > d){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
