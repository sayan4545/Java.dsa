package Arrays;

public class PivotElement {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9,2};
        System.out.println(returnPivotIndex(arr));

    }
    public static int returnPivotIndex(int[] arr){
        int s=0;
        int e = arr.length-1;
        int mid = s+(e-s)/2;
        while(s<=e){
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(s>=mid){
                e=mid-1;
            }
            if(s<=mid){
                s=mid+1;
            }
            mid = s+(e-s)/2;
        }
        return mid;
    }
}
