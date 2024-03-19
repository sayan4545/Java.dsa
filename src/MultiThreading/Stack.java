package MultiThreading;

public class Stack <Integer>{
    private int[] array;
    private int StackTop;
    private Object lock1;

    public Stack(int capacity){
        array = new int[capacity];
        StackTop=-1;
        lock1 = new Object();
    }
    public boolean isEmpty(){
        return StackTop<0;
    }
    public boolean isFull(){
        return StackTop>=array.length-1;
    }
    public synchronized boolean push(int value){
        if(isFull()){
            return false;
        }
        ++StackTop;
        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
        array[StackTop]=value;
        return true;

    }
    public  synchronized int pop(){

        if(isEmpty()){
            return java.lang.Integer.MIN_VALUE;
        }
        int obj = array[StackTop];
        array[StackTop]= java.lang.Integer.MIN_VALUE;
        try{Thread.sleep(1000);}catch(Exception e){ };
        StackTop--;
        return obj;


    }

}
