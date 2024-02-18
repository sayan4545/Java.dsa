package OOPS.Inheritence;

public class BabyBox  extends Box{
    double b;
    BabyBox(){
        this.b=-1;
    }
    BabyBox(double l,double w,double h,double b){
        super(l,w,h);
        this.b=b;
    }
    BabyBox(BabyBox other){
        super(other);
        this.b=other.b;
    }

    public BabyBox(double side) {
        super(side);
    }
}
