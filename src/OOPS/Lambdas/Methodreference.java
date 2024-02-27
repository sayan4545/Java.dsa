package OOPS.Lambdas;

import java.util.function.Supplier;

public class Methodreference {

    static class A{
        private static int last_id =1;
        private int id;
        A(){
            this.id = A.last_id++;
            System.out.println("A is created with id : "+ id);
        }
    }
    public static void main(String[] args) {
        Supplier<A> ref1 = ()->new A();
        ref1.get();
        Supplier<A> ref2 = A::new;
        ref2.get();


    }
}
