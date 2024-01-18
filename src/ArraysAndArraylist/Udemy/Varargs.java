package ArraysAndArraylist.Udemy;

public class Varargs {
    public static void main(String... args) {
        System.out.println("hello world again");
        String[] splitString = "hello world again".split(" ");
        printText(splitString);
        System.out.println("_".repeat(10));
        printText("hello","World","Again");


    }
    public static void printText(String... textList){
        for(String t: textList){
            System.out.println(t);
        }
    }

}
