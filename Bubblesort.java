import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubble(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j] <= nums[j-1] ){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    
                }
            }
        }
    }
}
