import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the operation: ");
        Scanner sc = new Scanner(System.in);
        char op = sc.next().trim().charAt(0);
        int ans =0;
        if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
            int a = sc.nextInt();
            int b=sc.nextInt();
            if(op=='+'){
                 ans = a+b;
            }
            else if(op=='-'){
                 ans = a-b;
            } else if (op == '*') {

                 ans = a*b;
            }else if(op=='/'){
                 ans = a/b;
            }else if(op=='%'){
                if(b==0){
                     ans = 0;
                }else{
                     ans = a%b;
                }
            }else{
                System.out.println("Invalid operation!!");
            }
        }
        System.out.println(ans);
    }
}
