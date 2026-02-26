package LeetCode;
public class validSplit {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3};
        int ans = waysToSplitArray(nums);
        System.out.println(ans);
    }
    static int waysToSplitArray(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int i=0;i<nums.length-1;i++){
            
            int sumb = 0;
            sum += nums[i];
            for(int j=i+1;j<nums.length;j++){
                sumb+= nums[j];
            }
            if(sum >= sumb){
                count++;
            }

        }
        return count;
    }
}
