package Functions;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(2,3,5));

    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
}
