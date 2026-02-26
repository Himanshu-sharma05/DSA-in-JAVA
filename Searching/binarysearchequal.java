package Searching;
public class binarysearchequal {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1};;
        int start = 0;
        int end = nums.length-1;
        int target = 0;
        int ans = binarysearch(nums, target, start, end);
        System.out.println(ans);
    }
    static int binarysearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>nums[mid]){
                start = mid+1;
            }
            else if(target < nums[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
