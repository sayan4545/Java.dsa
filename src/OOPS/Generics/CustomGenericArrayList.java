package OOPS.Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE =10;
    private int size =0;

    CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            reSize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size==data.length;
    }
    private void reSize(){
        Object[] temp = new Object[data.length*2];
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        data[index]= value;
    }
    public T get(int index){
        return (T)data[index];
    }

    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
