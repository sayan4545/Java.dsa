package Recursion;

public class Count_Ones {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1,0,1,1,1};
        System.out.println(countConsecutiveOnes(arr));

    }
    public static int countConsecutiveOnes(int[] arr){
        int count =0;
        int index_count =0;
        for(int i: arr){
            if(i==1){
                index_count++;
                count = Math.max(count,index_count);
            }else{
                index_count=0;
            }
        }
        return count;
    }

}
