package LinkedList_Stacks_Queues;

import java.util.LinkedList;

record Place(String name, int distance){};

public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<Place> places2visit = new LinkedList<>();
        Place place = new Place("Chittaranjan",3);
        addPlaces(places2visit,place);
        addPlaces(places2visit,new Place("Asansol",17));
        addPlaces(places2visit,new Place("Kolkata",234));
        addPlaces(places2visit,new Place("Asansol",17));
        addPlaces(places2visit,new Place("Salanpur",10));
        System.out.println(places2visit);

    }
    public static void addPlaces(LinkedList<Place> list,Place place){
        if(list.contains(place)){
            System.out.println("Found a duplicate"+ place);
            return;
        }
        // condition for ordering the linkedlist
//        int matchedIndex = 0;
//        for(Place p : list){
//            if(place.distance()<p.distance()){
//                list.add(matchedIndex,place);
//                return;
//            }
//            matchedIndex++;
//        }
        var iterator = list.listIterator();
        int index =0;
        while(iterator.hasNext()){
            if(place.distance()<iterator.next().distance()){
                list.add(index,place);
                return;
            }
            index++;
        }
        list.add(place);
    }
}
