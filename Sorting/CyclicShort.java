package Sorting;

import java.util.Arrays;

public class CyclicShort {
    public static void main(String[] args) {
        int[] nums = {1};
        cyclicSort2(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclicsort(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i] < nums.length && nums[i] != nums[nums[i]]){
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
            }
            else{
                i++;
            }
        }
    }
    static void cyclicSort2(int[] nums){
        int i = 0;
        
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }

        
    }
}
