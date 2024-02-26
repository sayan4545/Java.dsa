package OOPS.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdasImpl {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Sayan","Chandrika","Bishal","Babai","Arka"));
        list.forEach(s-> System.out.println(s));
        list.forEach((e)->{if(e.charAt(0)=='B')
            System.out.println(e);});
        System.out.println("-----------");
        list.forEach((s)-> System.out.println(STR."\{s} means \{s.charAt(0)}"));

    }
}
