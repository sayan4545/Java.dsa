package Recursion;
public class Basics_01 {
    public static void message1(){
        System.out.println("Hello");
        message2();
    }
    public static void message2(){
        System.out.println("Hello");
        message3();
    }
    public static void message3(){
        System.out.println("Hello");
        message4();
    }
    public static void message4(){
        System.out.println("Hello");
    }
    public static void message(int n){
        System.out.println("Hello");
        if(n==5){
            return;
        }

        message(n+1);
    }
    public static void main(String[] args) {
        message(2);
    }
}
