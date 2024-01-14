import java.util.*;
public class Check_occurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long number = in.nextLong();
        System.out.println("Enter the target: ");
        int number_occ = in.nextInt();
        int count =0;
        //int n = (int)number/10;
        while(number>0){
            int rem= (int)number%10;

            if(number_occ==rem){
                count++;
            }
            number = number/10;

        }
        System.out.println(count);


    }
}
