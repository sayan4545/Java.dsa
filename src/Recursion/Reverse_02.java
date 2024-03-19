package Recursion;

public class Reverse_02 {
    public static void main(String[] args) {
        int n = 2345;
        rev(n);
        System.out.println(sum);
    }
    static int sum =0;
    public static void rev(int n){
        if(n==0){
            return;
        }
        int rem =n%10;
        sum = sum*10+rem;
        rev(n/10);

    }
}
