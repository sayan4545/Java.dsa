package Functions;
import java.util.*;
public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)==true){
            System.out.println("The number "+ n+ " is prime");
        }else{
            System.out.println("The number "+ n +" is not prime");
        }


    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c =2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
