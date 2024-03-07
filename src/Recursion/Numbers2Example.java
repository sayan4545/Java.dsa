package Recursion;

public class Numbers2Example {
    public static void main(String[] args) {
        printN(5);



    }
    static void printN(int n){
        if(n==0){
            return;
        }
        printN(n-1);
        System.out.println(n);
    }

}
