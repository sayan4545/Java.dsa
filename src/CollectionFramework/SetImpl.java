package CollectionFramework;

import java.util.*;

public class SetImpl {
    public static void main(String[] args) {
////        Set<Integer> set1 = new HashSet<>();
////        set1.add(1);
////        set1.add(2);
////        set1.add(3);
////        set1.add(4);
////        set1.add(5);
////        set1.add(6);
////        set1.add(7);
////        System.out.println(set1);
////        //set1.add(3);-->duplicates are not allowed in sets
////        System.out.println(set1);
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(2);
//        list1.add(4);
//        list1.add(5);
//        list1.add(9);
//        Set<Integer> set1 = new HashSet<>(list1);
//        System.out.println(set1);
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(2);
//        set2.add(4);
//        set2.add(7);
//        set2.add(10);
//        set2.add(18);
//        set2.add(19);
//        System.out.println(set2);
//        set1.retainAll(set2);//returns the intersection of the two sets
//        System.out.println(set1);
//        Set<Integer> set3 = new LinkedHashSet<>(set2);
//        set3.forEach(s-> System.out.print(s+" "));
//        System.out.println("----------");
//        for(int x:set2){
//            System.out.print(x+" ");
//        }
        List<Integer> list1 = new ArrayList<>();
        //Set<Integer> set1 = new HashSet<>(list1);
        list1.add(10);
        list1.add(120);
        list1.add(130);
        list1.add(140);
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new LinkedHashSet<>(list1);
        for(int x: set1){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x: set2){
            System.out.print(x+" ");
        }
    }



}
