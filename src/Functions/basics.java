package Functions;
import java.util.*;
public class basics {
    public static int sum(int a,int b){

        int sum = a+b;
        return sum;
    }
    public static void greeting(){
        System.out.println("Hey Papa!");

    }
    public static String greet(){
        Scanner sc = new Scanner(System.in);
        String greet = sc.nextLine();
        return greet;
    }
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

    }
    public static void changeArray(int[] arr){
        arr[0] = 100;

    }
    public static void greet2(String name){
        System.out.println(name);

    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first element: ");
//        int a = sc.nextInt();
//        System.out.println("Enter the second element: ");
//        int b = sc.nextInt();
//        int ans = sum(a,b);
//        System.out.println("sum of "+ a+" and"+ b +"is : "+ ans);
//        greeting();
//        System.out.println(greet());
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a+" "+b);
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        changeArray(nums);
        System.out.println(Arrays.toString(nums));
        String naam = "Sayan Chatterjee";
        greet2("Chandrika Dey");
        //System.out.println(naam);




    }
}
