package ArraysAndArraylist.Udemy;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Examples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(123);
        list2.add(124);
        list.add(12);
        list.add(1,34);
        list.addFirst(1);
        list.addLast(100);
        list.addAll(list2);
        System.out.println(list.size());

        System.out.println(list);
        ArrayList<Integer> list3 = new ArrayList<>(10);
        //Taking input
        for(int i =0;i<5;i++){
            list3.add(sc.nextInt());
        }
        for(int i =0;i<5;i++){
            System.out.println(list3.get(i));;
        }
        System.out.println(list3);



    }



}
