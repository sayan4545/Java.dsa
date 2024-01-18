package ArraysAndArraylist.Udemy;
import java.util.*;

public class NestedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println(Arrays.deepToString(arr));



    }
}
