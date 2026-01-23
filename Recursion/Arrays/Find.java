package Recursion.Arrays;

public class Find {
    public static void main(String[] args) {
        int[] arr = {4,5,2,6,745,39};
        System.out.println(findIt(arr, 75, 0));
    }
    static boolean findIt(int[] arr,int no,int index){
        if(index == arr.length-1){
            return false;
        }
        return (arr[index] == no) || findIt(arr, no, index+1);
    }
}
