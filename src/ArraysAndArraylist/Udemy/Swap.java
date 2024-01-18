package ArraysAndArraylist.Udemy;
import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        swap(list,0,4);
        System.out.println(list);
    }
    public static void swap(ArrayList<Integer> list,int index1,int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

    }
}
