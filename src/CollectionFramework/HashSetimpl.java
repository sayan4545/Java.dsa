package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetimpl {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bishal Bose",89,89);
        List<Employee> emplList = new ArrayList<>();
        emplList.add(new Employee("Sayan Chatterjee",01,93));
        emplList.add(new Employee("Arka Ghosh",02,99));
        emplList.add(e1);

        Set<Employee> empSet = new HashSet<>(emplList);
        System.out.println(empSet.contains(e1));
    }
}
