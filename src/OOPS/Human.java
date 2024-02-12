package OOPS;

public class Human {
    int age;
    String name;
    double salary;
    boolean married;
    static long population =100;

    public Human(int age,String name,double salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population++;
    }
}
