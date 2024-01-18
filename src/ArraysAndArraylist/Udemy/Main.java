package ArraysAndArraylist.Udemy;
import java.util.*;
record GroceryList(String name, String type ,int count){
    public GroceryList(String name){
        this(name,"Dairy",1);
    }
}
public class Main {
    public static void main(String[] args) {
//        Object[] Grocery = new Object[3];
//        Grocery[0] = new GroceryList("Milk");
//        Grocery[1]= new GroceryList("Tomato","Vegetables",8);
//        Grocery[2]= "5 oranges";
//        System.out.println(Arrays.toString(Grocery));
        //Since this is an object type, The compiler allows to assign a String object.
        GroceryList[] Grocery = new GroceryList[3];
        Grocery[0] = new GroceryList("Milk");
        Grocery[1]= new GroceryList("Tomato","Vegetables",8);
        Grocery[2]= new GroceryList("Oranges","Fruits",10);
        System.out.println(Arrays.toString(Grocery));

    }
}
