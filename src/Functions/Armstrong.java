package Functions;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if(isArmstrong(n)==true){
//            System.out.println("is Armstromg number");
//        }else{
//            System.out.println("is not Armstrong number");
//        }
        for(int i=0;i<1000;i++){
            if(isArmstrong(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum = sum+(rem*rem*rem);
            n = n/10;
        }
        return sum==original;
    }

}

