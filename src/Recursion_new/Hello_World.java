package Recursion_new;

public class Hello_World {
    public static void main(String[] args) {
        message(1);

    }
    static void message(int n){
        if(n==5){
            System.out.println("Hello World");
            return;
        }
        System.out.println("Hello World");
        message(n+1);


    }



}
