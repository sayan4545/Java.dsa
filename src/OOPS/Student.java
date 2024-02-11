package OOPS;

public class Student {
    int roll_no;
    String name;
    float marks;

    //we need a way to initialise this ,and add valuers of the
    //properties object by object.

    void greeting(){
        System.out.println("Hello , my name is "+ this.name +" ,good morning!");
    }

//    public Student(String name,int roll_no,float marks){
//        this.name= name;
//        this.marks = marks;
//        this.roll_no = roll_no;
//
//    }
    Student(String naam,int rno,float marks){
        this.name = naam;
        this.roll_no=rno;
        this.marks= marks;

    }
    //constructor taking value from another constructor
    Student(Student other){
        this.name = other.name;
        this.roll_no = other.roll_no;
        this.marks = other.marks;
    }
    //calling constructor from another constructor
    Student(){
        this("Bishal",12,89.09f);
    }

}
