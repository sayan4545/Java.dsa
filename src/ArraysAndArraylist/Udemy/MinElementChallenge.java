package ArraysAndArraylist.Udemy;
import java.util.*;

public class MinElementChallenge {
    public static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] splits = input.split(",");

        int[] integers = new int[splits.length];
        for(int i=0;i<integers.length;i++){
            integers[i] = Integer.parseInt(splits[i].trim());
        }
        return integers;

    }
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void reverseArray(int[] arr){
        int end = arr.length-1;
        int mid = arr.length/2;

        for(int i=0;i<mid;i++){
            int temp = arr[i];
            arr[i] = arr[end-i];
            arr[end-i]= temp;
            System.out.println(Arrays.toString(arr));
        }
//        while(start<=end){
////            arr[start] = arr[end];
////            arr[end] = arr[start];
//            temp[start] = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp[start];
//            start++;
//            end--;
//        }

    }
    public static void reverse2(int[] arr){
        int start =0;
        int end = arr.length-1;
        int half = arr.length/2;

        while(start<half){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = readIntegers();
        System.out.println(Arrays.toString(arr));
        int minimum_element = findMin(arr);
        System.out.println("The minimum element is : "+ minimum_element);
//        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));
        reverse2(arr);
        System.out.println(Arrays.toString(arr));


    }

}
