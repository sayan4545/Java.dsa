package ArraysAndArraylist.Udemy;
import java.util.*;

public class NestedArray_2 {
    public static void main(String[] args) {
//       // Scanner sc = new Scanner(System.in);
//        int[][] array2 = new int[3][3];
//        array2[0] = new int[]{1,2,3};
//        array2[1] = new int[]{3,4,5};
//        array2[2] = new int[]{6,7,8};
//        System.out.println(Arrays.deepToString(array2));
        Scanner sc = new Scanner(System.in);
        Object [][] anyArray = new Object[3][3];
        anyArray[0] = new String[]{"Sayan","Chandrika","Bishal"};
        anyArray[1] = new String[][]{{"1","2","3"},{"4","5","6"}};
        anyArray[2] = new String[2][2][2];

        for(Object obj:anyArray){
            System.out.println("Element type " + obj.getClass().getSimpleName());
            System.out.println(Arrays.deepToString((Object[])anyArray));
        }


    }
}
