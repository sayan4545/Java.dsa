package Collections;

import java.util.*;

public class Overview {
    public static void main(String[] args) {
        Collection<String> list = new LinkedList<>();
        String[] names = {"Sayan","Chandrika","Bishal","Victor"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);
        list.addAll(Arrays.asList("Gary","Fred"));
        System.out.println(list);
        System.out.println(STR."is Gary a part of the list? \{list.contains("Gary")}");
        list.remove("Gary");
        System.out.println(STR."is Gary a part of the list? \{list.contains("Gary")}");
        list.removeIf(s -> s.charAt(0)== 'S');//using lambda expression
        System.out.println(list);
    }
}
