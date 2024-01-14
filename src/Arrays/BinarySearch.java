package Arrays;
import java.util.*;

public class BinarySearch {
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]>target){
                end = mid -1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int target = sc.nextInt();
        int answer = binarySearch(arr,target);
        if(answer==-1){
            System.out.println("Target not found");
        }else{
            System.out.println("Target found and at index : " + answer);
        }
    }
}
