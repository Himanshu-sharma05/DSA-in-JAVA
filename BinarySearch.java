public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 17;
        int index = ciel(arr,target);
        System.out.println(arr[index]);
    }
    static int ciel(int[] ans,int target){
        int start = 0;
        int end = ans.length-1;
        while(start <= end){
            if(ans[ans.length-1] < target){
                return -1;
            }
            int mid = start + (end-start)/2;
            if(target<ans[mid]){
                end = mid-1;
            }
            else if(target > ans[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
            
            
        }
        return start;
    }
}