package CollectionFramework.Iterator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueImpl {
    public static void main(String[] args) {
//        Queue<String> qS = new LinkedList<>();
//        qS.add("Sayan Chatterjee");
//        qS.add("Chandrika Dey");
//        qS.add("Bishal Bose");
//        qS.add("Arka Ghosh");
//        qS.add("Nabanita Das");
//        qS.add("Tirtha Raj");
//        System.out.println(qS);
//        System.out.println(qS.peek());
//        System.out.println(qS.poll());
//        System.out.println(qS.peek());

        Stack<String> stack = new Stack<>();
        stack.push("Sayan");
        stack.push("Bishal");
        stack.push("Chandrika");
        stack.push("Arka");
        stack.push("Snehamoy");
        System.out.println(stack);
//        while(stack.isEmpty()!=true){
//            System.out.println(stack.peek());
//            stack.pop();
//        }
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.add("Roy");
        System.out.println(stack);
        stack.add(3,"raja");
        System.out.println(stack);
    }
}
