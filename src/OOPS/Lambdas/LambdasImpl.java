package OOPS.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdasImpl {

    public static <T> T calculator(Operations<T> function, T v1, T v2) {
        T result = function.operate(v1, v2);
        System.out.println("The result of the operation is : " + result);
        return result;

    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s) {
        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }


    public static void main(String[] args) {
//        List<String> list = new ArrayList<>(List.of("Sayan","Chandrika","Bishal","Babai","Arka"));
//        list.forEach(s-> System.out.println(s));
//        list.forEach((e)->{if(e.charAt(0)=='B')
//            System.out.println(e);});
//        System.out.println("------------------------------");
//        list.forEach((s)-> System.out.println(STR."\{s} means \{s.charAt(0)}"));

        //ArrayList<Integer> list2 = new ArrayList<>();

        int result = calculator((a, b) -> a + b, 3, 4);
        var result2 = calculator((String a, String b) -> a.toUpperCase() + " " + b.toUpperCase(), "Sayan", "Chatterjee");
        var coords = Arrays.asList(
                new Double[]{21.890, -23.89},
                new Double[]{47.89, -67.89},
                new Double[]{34.89, -77.89}
        );

        coords.forEach(s -> System.out.println(Arrays.toString(s)));
        BiConsumer<Double, Double> p1 = (a, b) -> System.out.printf("[lat:%.3f lon:%.3f]%n", a, b);
        var firstPoint = coords.get(0);
//       processPoint(firstPoint[0],firstPoint[1],p1);
//        System.out.println("--------------------------------------------------------");
//       coords.forEach(s->processPoint(s[0],s[1],
//               (a,b)->System.out.printf("[lat:%.3f lon:%.3f]%n",a,b)));

        List<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Kolkata", "Bengaluru", "Chandigarh", "Mumbai", "Delhi", "Chennai", "Rupnarayanpur"));
        list3.forEach(s -> System.out.println(s));
        System.out.println("--------------------------------------------------------------");
        list3.removeIf(s -> s.startsWith("Ch"));
        list3.forEach(s -> System.out.println(s));

        List<String> list4 = new ArrayList<>();
        list4.add("Adam");
        list4.add("Bazz");
        list4.add("Cat");
        list4.add("Dongo");
        list4.add("Eve");
        System.out.println(list4);
        list4.replaceAll(s -> s.charAt(0) + " -" + s.toUpperCase());
        System.out.println(list4);

        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));
        System.out.println("------------------------");
        Arrays.fill(emptyStrings, "");
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.setAll(emptyStrings, s -> (s + 1) + " " + ".");
        System.out.println(Arrays.toString(emptyStrings));
        System.out.println("----------------------------");
        Arrays.setAll(emptyStrings, i -> (i + 1) + " " + "." +
                switch (i) {
                    case 0 -> "One";
                    case 1 -> "Two";
                    case 2 -> "Three";
                    default -> "zero";
                });

        System.out.println(Arrays.toString(emptyStrings));

        String[] names = new String[]{"Sayan", "Chandrika", "Bishal", "Victor", "Arka", "Babai"};
        String[] randomList = randomlySelectedValues(10, names,
                () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));

        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printpartsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String s : parts) {
                System.out.println(s);
            }
        };
        Consumer<String> printPartsLambdaNew = (sentence) -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };
        Consumer<String> printPartsLambdaConcise = (sentence) -> Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));

        printpartsLambda.accept("I am a Boy");
        System.out.println("----------------------");
        printTheParts.accept("I am a Boy");
        System.out.println("-----------------------");
        printPartsLambdaNew.accept("I am a Boy");
        System.out.println("-----------------------");
        printPartsLambdaConcise.accept("I am a boy");
    }
}









