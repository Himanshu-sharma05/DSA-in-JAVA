package Recursion.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        SelectionSort(arr, arr.length, 0, 0);
        // Sort(arr,3,0);
        System.out.println(Arrays.toString(arr));
        // triangle(4, 0);
        // printPattern(4, 0);

    }
    static void printPattern(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            printPattern(r, c+1);
        } else{
            System.out.println();
            printPattern(r-1, 0);
        }
        
    }
    static void Sort(int[] arr,int r,int c){
        if(r == 0){
            return;
        }
        if(r>c){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            Sort(arr,r,c+1);
        }
        else{
            Sort(arr,r-1,0);
        }
    }
    static void SelectionSort(int[] arr,int r,int c,int max){
        if(r == 0){
            return;
        }
        if(r>c){
            if(arr[c] > arr[max]){
                SelectionSort(arr, r, c+1, c);
            }else{
                SelectionSort(arr,r,c+1,max);
            }  
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            SelectionSort(arr, r-1, 0, 0);
        }
    }
}
