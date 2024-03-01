package Recursion_new;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,10};
        int target = 1;
        int ans = bs(arr,0, arr.length-1, target);
        System.out.println("The index is : "+ ans);

    }
    static int bs(int[]arr,int s,int e,int target){
        int m = s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            return bs(arr,s,m-1,target);
        }else{
            return bs(arr,m+1,e,target);
        }
    }
}
