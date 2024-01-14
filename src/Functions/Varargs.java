package Functions;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,3,5,6,7);
        multiple(2,3,"Sayan","Mukesh");

    }
    static void fun(int...v){//internally the integers are stored in arrays
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String...v){

    }
}
