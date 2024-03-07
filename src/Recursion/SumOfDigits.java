package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1032));
        System.out.println(prod(1432));

    }
    static int sumOfDigits(int n){
        if(n==0){
           return 0 ;
        }
        return n%10 +sumOfDigits(n/10);
    }
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return n%10*prod(n/10);

    }
}
