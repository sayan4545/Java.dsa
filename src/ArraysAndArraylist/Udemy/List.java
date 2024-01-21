package ArraysAndArraylist.Udemy;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Grocery> list = new ArrayList<>();
        list.add(new Grocery("Milk","Dairy",2,27));
        System.out.println(list);
    }
}
