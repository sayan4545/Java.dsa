package CollectionFramework;

public class Student implements Comparable<Student>{
    public int getMath_marks() {
        return math_marks;
    }

    public int getEng_marks() {
        return eng_marks;
    }

    private int math_marks;

    @Override
    public String toString() {
        return "Student{" +
                "math_marks=" + math_marks +
                ", eng_marks=" + eng_marks +
                '}';
    }

    public Student(int math_marks, int eng_marks) {
        this.math_marks = math_marks;
        this.eng_marks = eng_marks;
    }

    public void setMath_marks(int math_marks) {
        this.math_marks = math_marks;
    }

    public void setEng_marks(int eng_marks) {
        this.eng_marks = eng_marks;
    }

    private int eng_marks;


    @Override
    public int compareTo(Student o) {
        return o.math_marks-this.math_marks;
    }
}
