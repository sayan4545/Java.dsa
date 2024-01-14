import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        //int num = 1234;
        int ans =0;
        while(num>0){
            int rem = num%10;
            //System.out.print(rem);
            num = num/10;
            ans = ans*10+rem;

        }
        System.out.println(ans);
    }
}
