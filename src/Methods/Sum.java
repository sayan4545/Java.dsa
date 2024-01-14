package Methods;
import java.util.*;
public class Sum {
    Scanner sc = new Scanner(System.in);
     void sum(){
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The sum is : " +(a+b));
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        s.sum();
    }

}
