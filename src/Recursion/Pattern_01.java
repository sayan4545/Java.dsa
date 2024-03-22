package Recursion;

public class Pattern_01 {
    public static void main(String[] args) {
       printpattern_01(5);
        System.out.println();

      printPattern_01_recursive(0,0,5);

        System.out.println();
       printPattern_02_recursive(0,0,4);
        System.out.println();
        printPattern_03_recursive(0,0,5);
        System.out.println();


    }
    public static  void printpattern_01(int n){
        for(int row =0;row<n;row++){
            for(int col =0;col<n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printPattern_01_recursive(int row,int col,int n){
        if(row ==n){
            return;
        }
        if(col<n-row){
            System.out.print("* ");
            printPattern_01_recursive(row,col+1,n);
        }
        else{
            System.out.println();
            printPattern_01_recursive(row+1,0,n);
        }
    }
    public static void printPattern_02_recursive(int row,int col,int n){
        if(row==n){
            return;
        }
        if(col<n){
            System.out.print("* ");
            printPattern_02_recursive(row,col+1,n);

        }else{
            System.out.println();
            printPattern_02_recursive(row+1,0,n);
        }
    }
    public static void printPattern_03_recursive(int row,int col,int n){
        if(row==n){
            return;
        }
        if(col<row+1){
            System.out.print("* ");
            printPattern_03_recursive(row,col+1,n);
        }else{
            System.out.println();
            printPattern_03_recursive(row+1,0,n);
        }
    }

}
