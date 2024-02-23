package OOPS.abstraction;

public class Son extends Parent{

    int age;
    Son(int age){
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I want to be a "+ name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+ name+" her age is"+ age);
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
