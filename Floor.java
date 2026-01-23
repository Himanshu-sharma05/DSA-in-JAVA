public class Floor {
    public static void main(String[] args) {
        int[] arr = {0,1,5,8,16,19,21};
        int ans = binarySearch(arr, );
        System.out.println(ans);
    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}