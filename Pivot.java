public class Pivot {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2};
        int[] nums2 = {6,6,6,6,6,0,1,2};
        int[] nums3 = {10,1,10,10,10};
        int ans = findPivot(nums3);
        System.out.println(ans);
    }
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
             if(nums[mid] == nums[end] && nums[mid] == nums[start]){
                start++;
                end--;
                continue;
            }
            else if(nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]>=nums[start]){
                start = mid+1;
            }
            
            else{
                end = mid-1;
            }
        }
        return start;
}
}