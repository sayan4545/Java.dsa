package OOPS.Inheritence;

public class BoxPrice extends BabyBox{
    double cost;
    BoxPrice(){
        super();
        this.cost=-1;
    }
    BoxPrice(double l,double b,double h,double w,double cost){
        super(l,b,h,w);
        this.cost =cost;
    }
    BoxPrice(double side,double cost){
        super(side);
        this.cost = cost;
    }
}
