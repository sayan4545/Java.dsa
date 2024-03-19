package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        int n = 1206790;
        count(n);
        System.out.println(count);

    }
    static int count(int n){
        return helper(n);
    }
    static int count = 0;
    private static int helper(int n) {
        if(n/10==0){
            return n;
        }else{

            int rem = n%10;
            if(rem==0){
                count++;
            }
            return helper(n/10);
        }
    }
}
