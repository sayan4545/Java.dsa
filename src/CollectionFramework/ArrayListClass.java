package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListClass {
    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        for(int i=0;i<10;i++){
//            list1.add(i+1);
//        }
//        //System.out.println(list1);
//
//        List<Integer> list2 = new ArrayList<>(list1);
//        for(int i= list2.indexOf(list2.getLast());i<20;i++){
//            list2.add(i+2);
//        }
//        //System.out.println(list2);
//        list2.forEach(s-> System.out.println(s));
//        //System.out.println("--------------------------------------");
//        list2.forEach(System.out::println);
//        list2.addAll(new ArrayList<>(list1));
//        System.out.println(list2);
//        ListIterator<Integer> lk = list2.listIterator();
//        //System.out.println(lk.next());
//        //System.out.println(lk.next());
//        //System.out.println(lk.previous());
//        lk.add(1000);
//        System.out.println(list2);
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,5,7,8,9,10));
        System.out.println(list1);
        ListIterator<Integer> iterator = list1.listIterator();
        System.out.println(iterator);
        System.out.println(iterator.next());



    }
}
