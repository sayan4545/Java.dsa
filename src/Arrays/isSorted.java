package Arrays;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,4};
        System.out.println(isSorted(arr,1));
        System.out.println(isSorted2(arr));

    }
    public static boolean isSorted(int[] arr, int s) {
        if (s == arr.length - 1) {
            return true;
        }
        if (arr[s] <= arr[s + 1]) {
            return isSorted(arr, s + 1);
        } else {
            return false;
        }
    }
    public static boolean isSorted2(int[] arr){
        boolean result = false;
        for(int i =1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                result=true;
            }else{
                result = false;
            }

        }
        return result;
    }

}
