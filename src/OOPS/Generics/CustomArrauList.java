package OOPS.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrauList {
    private int[] data;
    private static int DEFAULT_SIZE =10;
    private int size =0;

    CustomArrauList(){
        this.data = new int[DEFAULT_SIZE];
    }

    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        int[] temp = new int[data.length*2];
        //copy the data into the temp array
        for(int i=0;i<data.length;i++){
            temp[i]= data[i];
        }
        data = temp;
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]= num;

    }
    public int remove(){
        int removed = data[--size];
        return  removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index ,int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrauList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
