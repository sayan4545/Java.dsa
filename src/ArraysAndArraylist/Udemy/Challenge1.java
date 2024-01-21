package ArraysAndArraylist.Udemy;
import java.util.*;
public class Challenge1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sayan");
        list.add("Sougata");
        list.add("Arka");
        list.add("Victor");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        System.out.println("Enter the index:");
        int index = sc.nextInt();
        function(key,list,index);

    }
    public static void function(int key,ArrayList<String> list,int index){

        if(key==1){
            changeList(list,index);
        }else if(key==2){
            orderFromList(list,index);
        }else if(key==3){
            addNewItem(list,index);
        }else{
            System.out.println("Invalid option");
        }

    }
    public static void changeList(ArrayList<String> list,int index){
        list.set(index,"Bishal");
        System.out.println(list);
    }
    public static void orderFromList(ArrayList<String> list,int index){
        System.out.println(list.get(index));
    }
    public static void addNewItem(ArrayList<String> list,int index){
        list.add(index,"Chandrika");
        System.out.println(list);
    }

}
