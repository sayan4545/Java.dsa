package ArraysAndArraylist.Udemy;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        String[] items = {"Cucumber", "Yogurt", "Eggs"};
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass());
        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("Papaya");
        System.out.println(groceries);
        groceries.add("Chicken");
        System.out.println(groceries);
        ArrayList<String> newGroceries = new ArrayList<>(list);
        newGroceries.add("Pointed Gourd");
        System.out.println(newGroceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("Pickles","Mustard","Coffee","Bread"));
        nextList.addAll(list);
        nextList.add("Mangoes");
        System.out.println(nextList.size());
        System.out.println(nextList);

        //fetching an item from the arrayList
        System.out.println("Third item is : "+ nextList.get(2));
        //searching for an item in the list

        if(nextList.contains("Mustard")){
            System.out.println("Contains Mustard");
        }

        nextList.add("Pickles");
        System.out.println("First index of Pickles : "+ nextList.indexOf("Pickles"));
        System.out.println("Last index of Pickles : "+ nextList.lastIndexOf("Pickles"));

        for(String str : nextList){
            System.out.print(str+ " ");
        }




    }

}




