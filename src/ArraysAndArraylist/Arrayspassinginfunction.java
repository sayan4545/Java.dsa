package ArraysAndArraylist;

import java.util.Arrays;

public class Arrayspassinginfunction {
    static void change(int[]arr){
        arr[0]=100;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
}
