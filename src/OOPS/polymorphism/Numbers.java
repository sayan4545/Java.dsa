package OOPS.polymorphism;

public class Numbers {
    double sum(int a, int b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2,3,4));
        System.out.println(obj.sum(3,4));
        //System.out.println(obj.sum(6,7,8,9));//This is compile time polymorphism
        //Which method to run , this is determined during the compile time.
        //All the memory allocations happen during the run time.




    }
}
