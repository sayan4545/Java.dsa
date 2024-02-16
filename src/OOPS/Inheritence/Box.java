package OOPS.Inheritence;

public class Box {
    double l;
    double h;
    double w;
    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Box(double side){
        this.l=side;
        this.w = side;
        this.h=side;
    }
    Box(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Box(Box some){
        this.l=some.l;
        this.w=some.w;
        this.h=some.h;
    }
    public void display(){
        System.out.println("The Box is running!");
    }
}
