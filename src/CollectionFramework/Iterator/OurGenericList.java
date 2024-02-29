package CollectionFramework.Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T> {
    private T[] items;
    private int size =0;
    private static final int DEFAULT_SIZE=10;
    public OurGenericList(){

        items = (T[])new Object[DEFAULT_SIZE];
    }
    public boolean isFull(){
        return size==items.length;
    }
    public void resize(){
        Object[] temp = new Object[size*2];
        System.arraycopy(items, 0, temp, 0, items.length);
        items = (T[])temp;
    }
    public void add(T item){
        if(isFull()){
            resize();
        }
        items[size++] =item;
    }
    public T getItemAtIndex(int index){
        return items[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        items[index] = value;
    }
    public T remove(){
        return items[--size];
    }

    @Override
    public String toString() {
        return STR."OurGenericList{items=\{Arrays.toString(items)}, size=\{size}\{'}'}";
    }


    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }
    private class OurGenericListIterator implements Iterator<T>{
        private int index=0;
        private OurGenericList<T> list;
        OurGenericListIterator(OurGenericList<T> list){
            this.list=list;
        }

        @Override
        public boolean hasNext() {
            return index< list.size;
            
        }

        @Override
        public T next() {
            return items[index++];

        }
    }


}
