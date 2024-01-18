package ArraysAndArraylist.Udemy;
import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }


    }

}
