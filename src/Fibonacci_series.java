import java.util.*;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n= sc.nextInt();
        //0,1,1,2,3,5,8,13,21,34...
        int i =0;
        int j =1;
        int count =2;
        while(count<=n){
            int temp = j;
            j= i+j;
            i=temp;
            count++;

        }
        System.out.println(j);

    }
}
