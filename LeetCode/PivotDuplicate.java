package LeetCode;
public class PivotDuplicate {

    public static void main(String[] args) {
        int[] nums = {10,1,10,10,10};
        int ans = findPivot(nums);
        System.out.println(ans);
    }
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid] == nums[start] && nums[mid]== nums[end]){
                end--;
                start++;
            }
            else if(nums[mid] == nums[end] && nums[mid]>nums[start]){
                end = mid;
            }
            else if(nums[mid] == nums[start] && nums[end] > nums[mid]){
                start = mid+1;
            }
            
            else if(nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(nums[mid] > nums[start]){
                start = mid + 1;
            }
            else if(nums[mid] < nums[start]){
                end = mid-1;
            }

        }

        
        return start;
    }
}