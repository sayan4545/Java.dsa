package OOPS;

import java.util.Arrays;

public class Implementation {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.name = "Sayan";
//        s1.roll_no=78;
//        s1.marks=100;
//        System.out.println(s1.name+" "+s1.roll_no+" "+s1.marks);
//        Student s2;
        //System.out.println(s2);
        /*
        This will not compile , since the variable s2 is not initialized.
         */
//        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students));
//        Student s1 = new Student();
//        System.out.println(STR."\{s1.roll_no} \{s1.marks} \{s1.name}");
//        s1.name = "Sayan Chatterjee";
//        s1.roll_no = 12;
//        s1.marks = 67;
//        System.out.println(STR."The students name is  \{s1.name} he scored \{s1.marks}");

//        Student s1 = new Student();
//        System.out.println(STR."\{s1.name} \{s1.roll_no} \{s1.marks}");
//        s1.greeting();
//        Student s2 = new Student();
//        System.out.println(s2.name+" "+s2.marks+" "+s2.roll_no);
//        s2.greeting();
        Student Sayan = new Student("Sayan Chatterjee",34,89.5f);
        System.out.println(Sayan.name+" "+Sayan.marks+" "+Sayan.roll_no);
        Sayan.greeting();

        Student Chandrika = new Student(Sayan);
        System.out.println(Chandrika.name+" "+Chandrika.marks+" "+Chandrika.roll_no);
        System.out.println(Chandrika.name.equals(Sayan.name));

        Student s3 = new Student();
        System.out.println(s3.name+" "+s3.roll_no+" "+s3.marks);

        final Student s4 = new Student("Anuska",10,99);
        s4.name="Shiuli Chatterjee";
        //s4 = new Student("Anish",45,98.98f);


    }
}
