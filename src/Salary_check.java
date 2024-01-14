import java.util.*;

public class Salary_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary in Rupees");
        double Salary = sc.nextDouble();
        if(Salary<30000) {
            Salary = Salary + 1234;
        }else if(Salary<40000){
            Salary = Salary +3400;
        }else if(Salary<60000){
            Salary = Salary +5000;
        }else{
            Salary = Salary +10000;
        }
        System.out.println("Updated Salary in rupees after providing bonus is : " +Salary);
    }






























}
