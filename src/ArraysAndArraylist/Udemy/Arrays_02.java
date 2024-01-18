package ArraysAndArraylist.Udemy;

import java.util.Arrays;
import java.util.Random;

public class Arrays_02 {
    public static void main(String[] args) {
        int[] firstArray = getRandomarray(5);
        System.out.println(Arrays.toString(firstArray));

        //Sorting the array in ascending order

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        if(Arrays.binarySearch(firstArray,87)>=0){
            System.out.println("Match found");

        }else{
            System.out.println("Didnt find a match");
        }
        int[] thirdArray  = new int[]{1,2,3,4,5};
        int[] fourthArray = new int[]{1,2,3,4,5};
        System.out.println(Arrays.equals(thirdArray,fourthArray));//gives a boolean value

        int [] fifthArray = getRandomarray(5);
        System.out.println(Arrays.toString(fifthArray));
        getSortedArray(fifthArray);
        System.out.println(Arrays.toString(fifthArray));


    }
    public static int[] getRandomarray(int length){
        Random random = new Random();
        int[] arr = new int[length];
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
        return arr;

    }
    public static int[] getSortedArray(int[] arr) {
        int temp;
        boolean swapped;
        

        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return arr;
    }

}
