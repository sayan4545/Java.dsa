package ArraysAndArraylist.Udemy;

import java.util.Arrays;
import java.util.*;

public class Arrays_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

//        for(int i=0;i<arr.length;i++){
//            System.out.print((arr.length-i)+" ");
//        }
        //System.out.println();

//        int[] newArray = arr;
//        System.out.println(Arrays.toString(newArray));
//
//        for(int i=0;i<newArray.length;i++){
//            newArray[i]=sc.nextInt();
//        }
////        System.out.println(Arrays.toString(arr));
////        System.out.println(Arrays.toString(newArray));
//        Object objectVariable = newArray;
//        if(objectVariable instanceof int[]){
//            System.out.println("Object variable is really an int array");
//        }

        Object[] array = new Object[3];
        array[0] = "hello";
        array[1] = 2;
        array[2] = new int[3];

        System.out.println(Arrays.toString(array));



    }
}
