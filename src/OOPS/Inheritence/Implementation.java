package OOPS.Inheritence;

public class Implementation {

    public static void main(String[] args) {
        Box box_1 = new Box();
        System.out.println(box_1.l+" "+ box_1.h+" "+ box_1.w);
        Box box_2 = new Box(2,3,4);
        System.out.println(box_2.l+" "+box_2.w+" "+ box_2.h);
        Box box_3 = new Box(3);
        System.out.println(box_3.l+ " "+box_3.w+" "+box_3.h);
        BabyBox box_4 = new BabyBox(2,3,4,5);
        System.out.println(box_4.l+" "+ box_4.h+" "+ box_4.h+" "+box_4.w);



    }
}
