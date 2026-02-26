package Searching;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class foursum {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        int target = 8;
        List<List<Integer>> ans = fourSum(nums,target);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    int total = nums[i]+nums[j]+nums[left]+nums[right];
                    if(total == target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        if(nums[left] == nums[right]){
                            return ans;
                            
                        }
                        left++;
                        right--;
                        
                    }
                    else if(total < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }

        }
        return ans;
    }
}
