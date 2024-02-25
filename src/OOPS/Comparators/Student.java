package OOPS.Comparators;

public class Student implements Comparable<Student>{

    int roll;
    float marks;
    Student(int roll,float marks){
        this.roll = roll;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks-o.marks);
        return diff;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                '}';
    }
}
