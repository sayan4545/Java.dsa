package Recursion;

public class PrintReverse {
    public static void main(String[] args) {
        printReverse(1234);
        System.out.println(sum);


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
}
