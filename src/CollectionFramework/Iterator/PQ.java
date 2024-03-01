package CollectionFramework.Iterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(3);
//        pq.offer(4);
//        System.out.println(pq);
//        int index =0;
//        List<Integer> top2 = new ArrayList<>();
//        List<Integer> bot2 = new ArrayList<>();
//        while(!pq.isEmpty()){
//            if(index==2) {
//                break;
//            }
//            top2.add(pq.poll());
//            index++;
//        }
//        List<Student> sl = new ArrayList<>();
//        sl.add(new Student(45,78));
//        sl.add(new Student(78,90));
//        sl.add(new Student(69,71));
//        sl.add(new Student(56,100));
//        sl.add(new Student(84,23));
//        sl.add(new Student(100,78));
//        sl.add(new Student(68,20));
//        PriorityQueue<Student> pqs = new PriorityQueue<>(sl);
//        System.out.println(pqs);
//        System.out.println("------------------------------------");
//        int index1 =0;
//        while(!pqs.isEmpty()){
//            if(index1==3){
//                break;
//            }
//            System.out.println(pqs.poll());
//            index1++;
//        }


//        System.out.println(top2);
//        System.out.println(pq);

        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator()) ;


        pq.offer(123);
        pq.offer(124);
        pq.offer(56);
        pq.offer(89);
        pq.offer(100);
        pq.offer(345);

        System.out.println(pq);
            int index = 0;
            List<Integer> list = new ArrayList<>();
        while(!pq.isEmpty())

            {
                if (index == 2)
                    break;
                list.add(pq.poll());
                index++;
            }
        System.out.println(list);
        System.out.println(pq);
        }
    }

