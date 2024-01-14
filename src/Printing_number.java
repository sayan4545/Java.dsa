import java.util.Scanner;

public class Printing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int x = sc.nextInt();
        int i=1;
        //int i =1;
//        while(i<=x){
//            System.out.println(i);
//            i++;
//        }

//        for(int i=1;i<=5;i++){
//            System.out.println(i);
//        }
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=x);

//        while(i<=x){
//            if(i%2==0){
//                System.out.print(i+" ");
//            }
//
//            i++;
//        }
        do{
            if(i%2==0){
                System.out.print(i+" ");

            }
            i++;

        }while(i<x);
    }
}
