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

        Student s1 = new Student("Sayan Chatterjee",34,99.6f);
        System.out.println(STR."\{s1.name} \{s1.roll_no} \{s1.marks}");

    }
}
