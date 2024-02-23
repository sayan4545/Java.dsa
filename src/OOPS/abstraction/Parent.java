package OOPS.abstraction;

public abstract class Parent {


    abstract void career(String name);
    abstract void partner(String name, int age);

    int age;
    public int sum(int a,int b){
        return a+b;
    }
    Parent(int age){
        this.age=age;
    }

}
