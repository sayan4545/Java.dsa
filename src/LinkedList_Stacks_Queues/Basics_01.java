package LinkedList_Stacks_Queues;

import java.util.LinkedList;
import java.util.ListIterator;

public class Basics_01 {
    public static void main(String[] args) {
        LinkedList<String> places2visit = new LinkedList<>();
        places2visit.add("Kolkata");
        places2visit.add("Chennai");
        places2visit.add("Mumbai");
        places2visit.add("Patna");
        places2visit.add("Gurugram");
        places2visit.addFirst("Rupnarayanpur");
        addmoreelements(places2visit);
        //System.out.println(places2visit);
        //removeElements(places2visit);
        places2visit.push("Ohio");
        System.out.println(places2visit);
        //getElement(places2visit);
        //printItinery3(places2visit);
        testIterator2(places2visit);
    }
    public static void addmoreelements(LinkedList<String> places2visit){//Deque methods
        places2visit.addFirst("Chittaranjan");
        places2visit.addLast("Bengaluru");
        //Queue methods
        places2visit.offer("Melbourne");
        places2visit.offerFirst("Sydney");
        places2visit.offerLast("Ohio");
        //Stack methods
        places2visit.push("Chandigarh");//adds element to the beginning of the list.

    }
    public static void removeElements(LinkedList<String> places2visit){
        places2visit.remove("Chittaranjan");//removes Chittaranjan
        places2visit.remove(2);//removes the element of the index 2
//        String s1 = places2visit.remove();
//        System.out.println(s1 +" Was removed");
//        String s2 = places2visit.removeFirst();//It also removes the first object from the list
//        System.out.println(s2 +" was removed");
//        String s3 = places2visit.removeLast();//it removes the last object from the list
//        System.out.println(s3+" was removed");
        //Queue/deque poll methods
        String p1  = places2visit.poll();
        System.out.println(STR."\{p1} was removed");

    }
    public static void getElement(LinkedList<String> list){
        String g1 = list.get(1);//retrieves the element bthat is at index 1 in the list
        System.out.println(STR."retrieved element : \{g1}");
        String g2 = list.getFirst();//retrieves the first element
        System.out.println(STR."retrieved element : \{g2}");
        String g3 = list.getLast();//retrieves the last element
        System.out.println(STR."retrieved element : \{g3}");
        System.out.println(STR."index of ohio is: \{list.indexOf("Ohio")}");
        System.out.println(list.isEmpty());
        System.out.println(STR."last position of Ohio is \{list.lastIndexOf("Ohio")}");
        //queue retrieval methods
        System.out.println(list.element());
        //stack retrieval methods
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());


    }
    public static void printItinery(LinkedList<String> list){
        System.out.println(STR."Trip starts at --> \{list.peek()}");
        System.out.println(STR."Trip ends at --> \{list.peekLast()}");
        for(int i= 1 ;i< list.size()-1;i++){
            System.out.println(STR."From --> \{list.get(i-1)} to -->\{list.get(i)}");
        }
    }
    public static void printItinery2(LinkedList<String> list){
        String previousPlace = list.getFirst();
        for(String town : list){
            System.out.println("From -->" + previousPlace + " to -->"+ town);
            previousPlace= town;
        }
    }
    public static void printItinery3(LinkedList<String> list){
        ListIterator<String> iterator = list.listIterator(1);
        String previousPlace = list.getFirst();
        while(iterator.hasNext()){
            String town = iterator.next();
            System.out.println(STR."From \{previousPlace } to \{ town}");
            previousPlace = town;
        }
    }
    public static void testIterator(LinkedList<String> list){
        var iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Rupnarayanpur")){
                iterator.remove();
            }
           // System.out.println(iterator.next());
        }
        System.out.println(list);
    }
    public static void testIterator2(LinkedList<String> list){
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Rupnarayanpur")){
                iterator.add("Asansol");
            }
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);
    }
}
