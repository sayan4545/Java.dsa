package ArraysAndArraylist;
import java.util.*;

public class Basics_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];//decalaring and initialising an array
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        //System.out.println(Arrays.toString(arr));
//        //System.out.println(arr[5]);//accesing array by the indices
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
        String[] str = new String[5];
        for(int i=0;i<str.length;i++){
            str[i]= sc.nextLine();
        }
        System.out.println(Arrays.toString(str));

    }
}
