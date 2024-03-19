package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,9,12,6};
        int target = 6;
        System.out.println(LS(arr,target,0));
        System.out.println(findLastIndex(arr,target, arr.length-1));

    }
    public static int LS(int[] arr, int target, int index){
        if(arr[index]==target){
            return index;
        } else if (index == arr.length) {
            return -1;
        }else{
            return LS(arr,target,index+1);
        }
    }
    public static int findLastIndex(int[] arr,int target, int index){
        if(index ==-1){
            return -1;
        }else if(arr[index]==target){
            return index;
        }else{
            return findLastIndex(arr,target,index-1);
        }
    }
    public static boolean LS2(int[] arr, int target, int index){
        if(index== arr.length){
            return false;
        }
        return (arr[index]==target)||LS2(arr,target,index+1);
    }
}
