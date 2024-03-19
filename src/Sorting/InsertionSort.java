package Sorting;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={1,2,67,89,0,2,6};
        System.out.println(Arrays.toString(InsertionSort(arr)));
    }
    public static void swap(int[] arr, int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    public static int[] InsertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }

}
