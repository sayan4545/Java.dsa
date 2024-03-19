package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8};
        System.out.println(isSorted(arr,0));

    }
    public static boolean isSorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        else{
            return arr[index]<arr[index+1]&&isSorted(arr,index+1);
        }
    }
}
