package Recursion;

public class NumbersExample {
    public static void main(String[] args) {
        printn(1);

    }
    public static void printn(int n){
        System.out.println(n);
        printn2(2);
    }

    private static void printn2(int i) {
        System.out.println(i);
        printn3(3);
    }

    private static void printn3(int i) {
        System.out.println(i);
        printn4(4);
    }

    private static void printn4(int i) {
        System.out.println(i);
        printn5(5);
    }

    private static void printn5(int i) {
        System.out.println(i);
    }

}
