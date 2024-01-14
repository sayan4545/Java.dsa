package Methods;
import java.util.*;

public class Reverse_2 {


    public static int reverse(int number){

        int reverse = 0;
        while(number>0){
            int remainder  = number%10;
            reverse = reverse *10+remainder;
            number = number/10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reverse_of_an_number = reverse(number);
        System.out.println("The reverse of "+ number +" is "+ reverse_of_an_number);
    }
}
