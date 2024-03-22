package Recursion;

import java.util.ArrayList;

public class ReturnAnArrayList {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,8,8,9};
        int target = 8;
        System.out.println(returnArrayList(arr,target,0,new ArrayList<>()));
    }
    static ArrayList<Integer> returnArrayList(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return returnArrayList(arr,target,index+1,list);
    }
}
