package OOPS.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class Implementation {

    public static void main(String[] args) {
//        List<Person> people = new ArrayList(Arrays.asList(
//                new Person("Sayan","Chatterjee"),
//                new Person("Chandrika","Dey"),
//                new Person("Bishal","Bose"),
//                new Person("Arka","Ghosh"),
//                new Person("Sougata","Chatterjee"),
//                new Person("Alolika","Har")
//        ));
//        System.out.println(people);
//
//        var compareFirstName = new Comparator<Person>(){
//
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getFirstName().compareTo(o2.getFirstName());
//            }
//        };
//
//        people.sort(compareFirstName);
//        System.out.println(people);
//        //using lambda functions
//        //people.sort(Comparator.comparing(Person::getFirstName));
//        people.sort((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
//        people.forEach(n-> System.out.println(n));
//        System.out.println("Picking the names starting with A only!");
//        people.forEach(n->{
//            if(n.getFirstName().charAt(0)=='A'){
//                System.out.println(n);
//            }
//        });

        HotelService h = new HotelService();
        List<Hotel> answer1 = h.filterHotelsLessThanPrice(2000);
        System.out.println(answer1);





    }
}
