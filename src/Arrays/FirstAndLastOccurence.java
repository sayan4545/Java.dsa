package Arrays;

import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,8,8,8};
        System.out.println(Arrays.toString(firstAndLastOccurence(arr,8)));
        int[] ans_arr = {firstOccurence(arr,8),lastOccurence(arr,8)};
        System.out.println(Arrays.toString(ans_arr));
    }
    public static int[] firstAndLastOccurence(int[] arr, int target){
        int first = -1;
        int last = -1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                if(first==-1){
                    first =i;
                }
                last =i;
            }
        }
        return new int[]{first,last};
    }
    public static int firstOccurence(int[] arr,int target){
        int s=0;
        int e = arr.length-1;
        int ans =-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==target){
                ans = m;
                e= m-1;
            }
            else if(arr[m]>target){
                e =m-1;
            }else{
                s= m+1;
            }
        }
        return ans;
    }
    public static int lastOccurence(int[] arr,int target){
        int s=0;
        int e = arr.length-1;
        int ans2 =-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==target){
                ans2 = m;
                s=m+1;
            }
            if(arr[m]>target){
                e =m-1;
            }else{
                s= m+1;
            }
        }
        return ans2;
    }
}
