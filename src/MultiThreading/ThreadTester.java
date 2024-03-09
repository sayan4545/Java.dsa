package MultiThreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main starts");
//        Thread t1 = new Thread1("t1");
//        //t1.setDaemon(true);
//        t1.start();
//        System.out.println("main exits");
//        System.out.println("--------------------------------");
////        Thread t2 = new Thread(new Thread2(),"t2");
////        t2.start();
//        Thread t3 = new Thread(()->{for(int i=0;i<5;i++)
//            System.out.println(Thread.currentThread()+" "+i);
//        },"t3");
//        t3.start();
        Stack<Integer> stack = new Stack<>(5);
        System.out.println("main starts");
        new Thread(()->{
            int counter =0;
            while(counter <10){
                System.out.println("Pushed "+ stack.push(100)+" "+counter);
                counter++;

            }
        },"Pusher").start();
        new Thread(()->{
            int counter =0;
            while(++counter<10){
                System.out.println("Popped "+stack.pop());
            }

        },"Popper").start();
        System.out.println("Main exits");
    }
}
