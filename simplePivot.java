public class simplePivot {
    public static void main(String[] args) {
        int[] nums = {5,6,0,1,2,3};
        int pivot = findPivot(nums);
        System.out.println(pivot);
    }
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid] >= nums[start]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
}
