package Recursion;

public class Steps_to_reduce_a_number_to_zero {
    public static void main(String[] args) {
        int n = 21;
        System.out.println(result(n));

    }
    static int result(int n){
        return helper(n,0);
    }

    private static int helper(int n, int i) {
        if(n==0){
            return i;
        }
        if(n%2==0){
            return helper(n/2,++i);
        }else{
            return helper(n-1,++i);
        }
    }
}
