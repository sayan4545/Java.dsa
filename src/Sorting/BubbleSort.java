package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        System.out.println(Arrays.toString(getSortedArrayBubbleSort(arr)));
        System.out.println(Arrays.toString(getSortedArrayBubbleSort2(arr)));

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

}
