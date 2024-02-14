package OOPS;

public class StaticBlock {
    static int a = 4;
    static int b;
    static{//This is Static Block.It will run only once when an object is created.
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        b = b+3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

    }
}
