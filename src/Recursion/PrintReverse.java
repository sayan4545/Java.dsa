package Recursion;

public class PrintReverse {
    public static void main(String[] args) {
        printReverse(1234);
        System.out.println(sum);
        System.out.println(rev(1234));
    }
    static int sum =0;
    static void printReverse(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        printReverse(n/10);

    }
    static int rev(int n){
        int digits = (int) (Math.log10(n)) +1;
        return helper(n,digits);



    }

    public static int helper(int n, int digits) {
        if(n/10 ==0){
            return n;
        }else{
            int rem = n%10;
            return rem*(int)Math.pow(10,digits-1) + helper(n/10,digits-1);
        }

    }
}
