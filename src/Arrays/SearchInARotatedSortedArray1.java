package Arrays;

public class SearchInARotatedSortedArray1 {
    public static void main(String[] args) {
        int[] arr = {17,13,14,15,16};
        System.out.println(search(arr,111));

    }
    public static int search(int[] arr, int target){
        int s =0;
        int e = arr.length-1;
        while(s<=e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                return m;
            } else if (arr[s] <= arr[m]) {
                if (target >= arr[s] && target <= arr[m]) {
                    e=m-1;
                } else {
                    s = m+1;
                }
            } else{
                if (target >= arr[m] && target <= arr[e]) {
                    s=m+1;
                } else {
                    e =m-1;
                }

            }
        }
        return -1;

        }
}
