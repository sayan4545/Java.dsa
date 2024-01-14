package Functions;

public class Shadowing {
    static int x = 100;//This is the higher level scope that will be hidden

    public static void main(String[] args) {
        System.out.println(x);
        int x = 90;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
