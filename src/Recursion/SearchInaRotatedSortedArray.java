package Recursion;
public class SearchInaRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr ={8,9,10,11,1,3,5,7};
        int target = 7;
        System.out.println(bsRotatedSorted(arr,target,0,arr.length-1));
    }
    public static int bsRotatedSorted(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[start]<=arr[mid]){
            if(target>=arr[start]&&target<=arr[mid]){
                return bsRotatedSorted(arr,target,start,mid-1);
            }else{
                return bsRotatedSorted(arr,target,mid+1,end);
            }
        }
        else if(target>=arr[mid]&&target<=arr[end]){
            return bsRotatedSorted(arr,target,mid+1,end);
        }else{
            return bsRotatedSorted(arr,target,start,mid-1);
        }
    }
}
