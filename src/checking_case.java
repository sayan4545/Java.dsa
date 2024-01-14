import java.util.Scanner;

public class checking_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        char c = sc.next().trim().charAt(0);
        if(c>='a'&& c<'z'){
            System.out.println("LOWER CASE");
        }else{
            System.out.println("UPPER CASE");
        }

    }
}
