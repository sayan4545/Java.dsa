package Onlinetests.Ques1;

import java.util.Arrays;

public class Implementation {
    public static int[] count(int[] arr, int val,int n){
        int small =0;
        int greater =0;
        int equal =0;

        for (int j : arr) {
            if (j < val) {
                small++;
            }
        }
        for (int j : arr) {
            if (j > val) {
                greater++;
            }
        }
        for (int j : arr) {
            if (j == val) {
                equal++;
            }
        }
        //int[] count = {small,greater,equal};
        return new int[]{small,greater,equal};
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{2,3,4,6,6,7,8};

        System.out.println(Arrays.toString(count(arr,5,7)));
    }
}
