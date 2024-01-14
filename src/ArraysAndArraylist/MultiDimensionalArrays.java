package ArraysAndArraylist;
import java.util.*;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[3][3];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]= sc.nextInt();
            }
        }
        //System.out.println(Arrays.toString(nums));
//        for(int[] num:nums){
//            System.out.println(num+" ");
//        }
        for(int i=0;i<nums.length;i++){
            System.out.println(Arrays.toString(nums[i]));

        }
        for(int[] arr:nums){
            System.out.println(Arrays.toString(arr));
        }

    }
}
