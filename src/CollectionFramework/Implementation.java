package CollectionFramework;

import java.util.Iterator;

public class Implementation {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list.size());
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
//        System.out.println(list.remove());
//        System.out.println(list.remove());
        System.out.println(list);
    }
}
