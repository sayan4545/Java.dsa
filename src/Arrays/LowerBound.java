package Arrays;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,3,6};
        int target = 4;
        System.out.println(lowerBound(arr,target));
        System.out.println(upperBound(arr,target));

    }
    public static int lowerBound(int[] arr,int target){
        int s =0;
        int e = arr.length-1;
        int ans = arr.length;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]>=target){
                ans = m;
                e = m-1;
            }else{
                s=m+1;
            }
        }
        return ans;

    }
    public static int upperBound(int[] arr,int target){
        int s =0;
        int e = arr.length-1;
        int ans = arr.length;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]>target){
                ans = m;
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return ans;

    }
}
