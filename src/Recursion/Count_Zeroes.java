package Recursion;
import java.util.*;

public class Count_Zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number of zeroes are : "+ countZero(n));

    }
    public static  int countZero(int n){
        return helper(n,0);
    }

    static int helper(int n, int i) {
        if(n==0){
            return i;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,++i);
        }else{
            return helper(n/10,i);
        }
    }
}
