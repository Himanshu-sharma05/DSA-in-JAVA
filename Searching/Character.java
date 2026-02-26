package Searching;
public class Character {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'k';
        int ans = charCiel(arr, target);
        System.out.println(ans);
        System.out.println(ans%arr.length);
    }
    static int charCiel(char[] arr,char target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
        
    }
}
