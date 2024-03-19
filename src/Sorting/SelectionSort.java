package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {34};
        System.out.println(Arrays.toString(SelectionSort(arr)));
    }
    static int[] SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getmaximumIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }
        return arr;
    }
    static int getmaximumIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max =i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first]= arr[last];
        arr[last] = temp;
    }
}
