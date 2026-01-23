package Recursion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = SubSets(arr);
        // List<List<Integer>> ans2 = SubSetsDuplicate(arr);
        for(List<Integer> l : ans){
            System.out.println(l);
        }
    }
    static List<List<Integer>> SubSets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int size = outer.size();
            for(int i=0;i<size;i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }   
        }
        return outer;
    }
    static List<List<Integer>> SubSetsDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0 ; i<arr.length;i++){
            int size = outer.size();
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size() - 1;
            for(int j=start;j<size;j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }   
        }
        return outer;
    }
}
