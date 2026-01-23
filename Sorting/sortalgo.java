package Sorting;

import java.util.Arrays;

public class sortalgo {
    public static void main(String[] args) {
        int[] nums = {-4,5,2,3,1,1,13,5};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    static void bubblesort(int[] nums){
        for(int i=0;i<nums.length;i++){
            boolean swapped = false;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j] > nums[j+1]){
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

    static void selectionSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i;j++){
                int end = nums.length-i-1;
                int max = maxIndex(nums, end);
                int temp = nums[max];
                nums[max] = nums[end];
                nums[end] = temp;
            }
        }
    }
    static int maxIndex(int[] nums,int end){
        //returns the index of the maximum no in the array from 0 to end
        int max = 0;
        for(int i=0;i<=end;i++){
            if(nums[max] < nums[i]){
                max = i;
            }
        }
        return max;
    }

    static void insertionSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
