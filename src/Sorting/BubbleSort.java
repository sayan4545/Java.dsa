package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5,6};
//        System.out.println(Arrays.toString(getSortedArrayBubbleSort(arr)));
//        System.out.println(Arrays.toString(getSortedArrayBubbleSort2(arr)));
        BubbleSortrecursive(arr,0,0);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] getSortedArrayBubbleSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }




    public static int[] getSortedArrayBubbleSort2(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void BubbleSortrecursive(int [] arr, int r, int c){
        if(r== arr.length){
            return;
        }
        if(c< arr.length-r-1){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;

            }
            BubbleSortrecursive(arr,r,c+1);

        }

        else{
            BubbleSortrecursive(arr,r+1,0);
        }

    }

}
