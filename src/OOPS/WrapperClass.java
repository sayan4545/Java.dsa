package OOPS;

public class WrapperClass {
    public static void main(String[] args) {
        Integer num = 19;//Integer is a final class
        int num2 = 18;
        System.out.println(num.getClass().getName());
        Integer a = 10;
        Integer b = 12;
        swap(a,b);
        System.out.println(STR."value of a is : \{a} Value of b is : \{b}");//It will not swap . Since Integer is a final class.


    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}
