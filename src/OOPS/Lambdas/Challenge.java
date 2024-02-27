package OOPS.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Challenge {

    private static Random random = new Random();


    public static void main(String[] args) {
        String[] names = {"Bob","Charlie","Nod","Damien","Mark"};
        Arrays.setAll(names,s-> names[s].toUpperCase());
        System.out.println(Arrays.toString(names));
        List<String> backedByArray = Arrays.asList(names);
        backedByArray.replaceAll((s)->s+" "+getRandomChar('A','D')+".");
        backedByArray.forEach(s-> System.out.println(s));
        backedByArray.replaceAll((s)->s+" "+reversedName(s.split(" ")[0]));
        System.out.println("-------------------------------------------------------------");
        backedByArray.forEach(s-> System.out.println(s));
        System.out.println("-------------------------------------------------------------");

        List<String> newList =new ArrayList<>(List.of(names));
        newList.removeIf((s)->s.substring(0,s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ")+1)));
        newList.forEach(s-> System.out.println(s));
    }

    public static char getRandomChar(char startChar, char endChar){
        return (char)random.nextInt((int)startChar,(int)(endChar+1));
    }
    public static String reversedName(String firstName){
        return new StringBuilder(firstName).reverse().toString();
    }
}
