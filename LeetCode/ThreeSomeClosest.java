package LeetCode;
import java.util.Arrays;

public class ThreeSomeClosest{
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80,90};
        int target = 1;
        int ans = threeSumClosest(nums, target);
        System.out.println(ans);
    }
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int sum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int checkSum = nums[left] + nums[right] + nums[i];
                if(checkSum == target){
                    return target;
                }
                else if(checkSum>target){
                    right--;
                }
                else{
                    left++;
                }

                int diff = Math.abs(target - checkSum);
                if(diff <= min){
                    sum = checkSum;
                    min = diff;
                }
        }
        
    }
    return sum;
}
}