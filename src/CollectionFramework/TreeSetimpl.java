package CollectionFramework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetimpl {
    public static void main(String[] args) {
        NavigableSet<Employee> treeSet = new TreeSet<>();
        treeSet.add(new Employee("Sayan",01,89));
        treeSet.add(new Employee("Chandrika",02,99));
        treeSet.add(new Employee("Bishal",03,79));
        treeSet.add(new Employee("Victor",04,69));
        treeSet.add(new Employee("Arka",05,59));

        System.out.println(treeSet);

        for(Employee e: treeSet){
            System.out.print(e+",");
        }

    }
}
