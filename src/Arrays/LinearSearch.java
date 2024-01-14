package Arrays;
import java.util.*;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target){
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans =i;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int target = sc.nextInt();
        int answer = linearSearch(arr,target);
        System.out.println(answer);
    }

}
