import java.util.ArrayList;

import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> look = new ArrayList<>();
        look = threeSum(nums);
        for(int i=0;i<look.size();i++){
            System.out.println(look.get(i));
        }
    }
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> anslist = new ArrayList<>();
        bubbleSort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j==i){
                    continue;
                }
                int target = nums[i] + nums[j];
                int ans = binarySearch(nums,target);
                if(i == ans || j == ans || ans == -1){
                    continue;
                }
                else if(nums[ans] + nums[i] + nums[j] == 0){
                    List<Integer> dummy = new ArrayList<>();
                    dummy.add(nums[i]);
                    dummy.add(nums[j]);
                    dummy.add(nums[ans]);
                    anslist.add(dummy);
                }
            }
        }
        return anslist;
    }
    static void bubbleSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            boolean swapped = false;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static int binarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target>mid){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
