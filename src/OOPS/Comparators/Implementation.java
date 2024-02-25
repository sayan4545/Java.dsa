package OOPS.Comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Implementation {
    public static void main(String[] args) {
        Student A = new Student(10,89.89f);
        Student B = new Student(11,90.89f);
        Student C = new Student(18,87.78f);
        Student D = new Student(17,67.8f);
        Student E = new Student(19,70.4f);
//        if(A.compareTo(B)>0){
//            System.out.println(STR."A has scored higher than B by \{A.compareTo(B)} mark(s)");
//        } else if (A.compareTo(B)==0) {
//            System.out.println("Both A and B has scored equal marks");
//        }else{
//            System.out.println(STR."B has scored higher than A by \{B.compareTo(A)} mark(s)");
//        }
        Student[] list = new Student[]{A,B,C,D,E};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
