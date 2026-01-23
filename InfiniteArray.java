public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8};
        // start with the box of size 2
        int[] ans = ans( arr,4);
        int start = ans[0];
        int end = ans[1];
        


    }
    static int[]  ans(int[] arr,int target){
        //first find the range
        // first start with a box of 2
        int start = 0;
        int end = 1;
        
        //condition for the box to double size
        while(target>arr[end]){
            int temp = end;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return new int[]{start,end};

    }
    static int binarySearch(int[] arr,int target,int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
