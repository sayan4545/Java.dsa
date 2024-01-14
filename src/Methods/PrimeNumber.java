package Methods;
import java.util.*;

public class PrimeNumber {
    Scanner in = new Scanner(System.in);
    boolean isPrime(int number){
        boolean isPrime = true;
        number = in.nextInt();
        if(number==0||number==1){
            return false;
        }for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }else{
                return true;
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        System.out.println(pn.isPrime(3));
    }
}
